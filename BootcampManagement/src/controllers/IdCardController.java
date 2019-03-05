/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.Date;
import java.util.List;
import models.Employee;
import models.IdCard;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class IdCardController implements IdCardControllerInterface{
    
    private DAOInterface<IdCard> dao;
    
    public IdCardController(SessionFactory factory){
        dao = new GeneralDAO<>(factory, IdCard.class);
    }

    @Override
    public IdCard getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<IdCard> getAll() {
      return dao.getData("");
    }

    @Override
    public List<IdCard> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String receivedate, String returndate, String note, String employee) {
        if (dao.saveOrDelete(new IdCard(id, new Date(receivedate), new Date(returndate), note, new Employee(employee)), true)) {
            return "Save Data Success";
        }
        return "Save Failed";
    }

    @Override
    public String delete(String id, String receivedate, String returndate, String note, String employee) {
        if (dao.saveOrDelete(new IdCard(id, new Date(receivedate), new Date(returndate), note, new Employee(employee)), true)) {
            return "Delete Data Success";
        }
        return "Delete Failed";
    }

}
