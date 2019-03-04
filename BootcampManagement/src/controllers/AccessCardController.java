/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.List;
import models.AccessCard;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class AccessCardController implements AccessCardControllerInterface{
    private DAOInterface<AccessCard> dao;
    
    public AccessCardController(SessionFactory factory){
        dao = new GeneralDAO<>(factory, AccessCard.class);
    }


    @Override
    public AccessCard getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<AccessCard> getAll() {
       return dao.getData("");
    }

    @Override
    public List<AccessCard> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String accessnumber) {
        if (dao.saveOrDelete(new AccessCard(id, accessnumber), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, String accessnumber) {
        if (dao.saveOrDelete(new AccessCard(id, accessnumber), true)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }
    
}
