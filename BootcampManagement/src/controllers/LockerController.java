/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.math.BigInteger;
import java.util.List;
import models.Locker;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class LockerController implements LockerControllerInterface{
    private DAOInterface <Locker> dao;
    
    public LockerController (SessionFactory factory){
        dao = new GeneralDAO<>(factory, Locker.class);
    }

    @Override
    public Locker getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Locker> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Locker> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, BigInteger lockernumber, String locker) {
        if (dao.saveOrDelete(new Locker(id, lockernumber), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, BigInteger lockernumber, String locker) {
        if (dao.saveOrDelete(new Locker(id, lockernumber), true)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }

}