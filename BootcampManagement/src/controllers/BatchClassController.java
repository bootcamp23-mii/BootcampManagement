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
public class BatchClassController implements BatchClassControllerInterface {
    private DAOInterface<BatchClass> dao;

    public BatchClassController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, BatchClass.class);
    }

    @Override
    public BatchClass getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<BatchClass> getAll() {
        return dao.getData("");
    }

    @Override
    public List<BatchClass> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String isdeleted, String batch, String classes, String trainer, String room) {
        if (dao.saveOrDelete(new BatchClass(id, new Short(isdeleted), new Batch(batch), new Classes(classes), new Employee(trainer), new Room(room)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String isdeleted, String batch, String classes, String trainer, String room) {
        if (dao.saveOrDelete(new BatchClass(id, new Short(isdeleted), new Batch(batch), new Classes(classes), new Employee(trainer), new Room(room)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
