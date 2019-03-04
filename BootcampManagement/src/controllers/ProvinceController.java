/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.List;
import models.Province;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class ProvinceController implements ProvinceControllerInterface{
    private DAOInterface <Province> dao;
    
    public ProvinceController(SessionFactory factory){
        dao = new GeneralDAO<>(factory, Province.class);
    }

    @Override
    public Province getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Province> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Province> search(Object keyword) {
       return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name) {
        if (dao.saveOrDelete(new Province(id, name), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, String name) {
        if (dao.saveOrDelete(new Province(id, name), false)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }
}
