/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.List;
import models.District;
import models.Subdistrict;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class SubDistrictController implements SubDistrictControllerInterface{
    private DAOInterface <Subdistrict> dao;
    
    public SubDistrictController (SessionFactory factory){
        dao = new GeneralDAO<>(factory, Subdistrict.class);
    }

    @Override
    public Subdistrict getById(String id) {
       return dao.getById(id);
    }

    @Override
    public List<Subdistrict> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Subdistrict> search(Object keyword) {
       return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String district) {
        if (dao.saveOrDelete(new Subdistrict(id, name, new District(district)), true)) {
            return "Save Data Success";
        } else {
            return "save Failed";
        }
    }

    @Override
    public String delete(String id, String name, String district) {
        if (dao.saveOrDelete(new Subdistrict(id, name, new District(district)), false)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }
}
