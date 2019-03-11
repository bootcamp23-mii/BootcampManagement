/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public List<BatchClass> searchWD(Object keyword) {
        return dao.getDataWD(keyword,0);
    }

    @Override
    public String save(String id, String batch, String classes, String trainer, String room) {
        if (dao.saveOrDelete(new BatchClass(id, new Short("0"), new Batch(batch), new Classes(classes), new Employee(trainer), new Room(room)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String batch, String classes, String trainer, String room) {
        if (dao.saveOrDelete(new BatchClass(id, new Short("1"), new Batch(batch), new Classes(classes), new Employee(trainer), new Room(room)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
    
    @Override
    public String deleteSoft(String id, String batch, String classes, String trainer, String room) {
        String tempID="";
        List<BatchClass> dataList = searchWD("");
        for (BatchClass data : dataList) {
            if (data.getBatch().getName().equals(batch)
                    &&data.getClasses().getName().equals(classes)
                    &&data.getTrainer().getName().equals(trainer)
                    &&data.getRoom().getName().equals(room)
                    )tempID=data.getId();
        }
        if (dao.saveOrDelete(new BatchClass(id, new Short("1"), new Batch(batch), new Classes(classes), new Employee(trainer), new Room(room)), true))
            return "Delete Data Success!";
        return "Delete Failed!";
    }
}
