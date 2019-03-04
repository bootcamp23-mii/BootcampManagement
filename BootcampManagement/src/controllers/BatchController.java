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
import models.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author gerydanu
 */
public class BatchController implements BatchControllerInterface {
    private DAOInterface<Batch> dao;

    public BatchController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, new Batch());
    }

    @Override
    public Batch getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Batch> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Batch> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String startdate, String enddate) {
        if (dao.saveOrDelete(new Batch(id, name, new Date(startdate), new Date(enddate)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }    }

    @Override
    public String delete(String id, String name, String startdate, String enddate) {
        if (dao.saveOrDelete(new Batch(id, name, new Date(startdate), new Date(enddate)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }    }
}
