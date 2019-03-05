/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.List;
import models.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author FES
 */
public class RoleController implements RoleControllerInterface{
    private DAOInterface<Role> dao;
    
    public RoleController(SessionFactory factory){
        dao = new GeneralDAO<>(factory, Role.class);
    }


    @Override
    public Role getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Role> getAll() {
       return dao.getData("");
    }

    @Override
    public List<Role> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name) {
        if (dao.saveOrDelete(new Role(id, name), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, String name) {
        if (dao.saveOrDelete(new Role(id, name), true)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }
    
}
