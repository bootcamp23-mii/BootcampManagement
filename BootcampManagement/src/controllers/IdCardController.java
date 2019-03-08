/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Employee;
import models.IdCard;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class IdCardController implements IdCardControllerInterface{
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
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
        try {
            if(dao.saveOrDelete(new IdCard(id, dateFormat.parse(receivedate), dateFormat.parse(returndate), note, new Employee(employee)), true)){
                return "Save Data Success";
            }
        } catch (ParseException ex) {
            Logger.getLogger(IdCardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Save Failed";
    }
    
    @Override
    public String delete(String id, String receivedate, String returndate, String note, String employee) {
        try {
            if(dao.saveOrDelete(new IdCard(id, dateFormat.parse(receivedate), dateFormat.parse(returndate), note, new Employee(employee)), false)){
                return "Delete Data Success";
            }
        } catch (ParseException ex) {
            Logger.getLogger(IdCardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete Failed";
    }

}
