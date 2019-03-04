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
public class ClassesController implements ClassesControllerInterface {
    private DAOInterface<Classes> dao;

    public ClassesController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Classes.class);
    }

    @Override
    public Classes getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Classes> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Classes> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String classes) {
        if (dao.saveOrDelete(new Classes(id, classes), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String classes) {
        if (dao.saveOrDelete(new Classes(id, classes), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
