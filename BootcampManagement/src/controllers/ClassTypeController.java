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
public class ClassTypeController implements ClassTypeControllerInterface {
    private DAOInterface<ClassType> dao;

    public ClassTypeController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, new ClassType());
    }

    @Override
    public ClassType getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<ClassType> getAll() {
        return dao.getData("");
    }

    @Override
    public List<ClassType> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String classtype) {
        if (dao.saveOrDelete(new ClassType(id, classtype), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String classtype) {
        if (dao.saveOrDelete(new ClassType(id, classtype), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
