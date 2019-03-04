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
 * @author gerydanu
 */
public class AspectController implements AspectControllerInterface {
    private DAOInterface<Aspect> dao;

    
    public AspectController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, new Aspect());
    }

    @Override
    public Aspect getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Aspect> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Aspect> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name) {
        if (dao.saveOrDelete(new Aspect(id, name), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id,String name) {
        if (dao.saveOrDelete(new Aspect(id, name), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
