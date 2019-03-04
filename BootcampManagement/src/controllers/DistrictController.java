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
import models.Province;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class DistrictController implements DistrictControllerInterface{
    private DAOInterface <District> dao;
    
    public DistrictController(SessionFactory factory){
        dao = new GeneralDAO<>(factory, District.class);
    }

    @Override
    public District getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<District> getAll() {
        return dao.getData("");
    }

    @Override
    public List<District> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String province) {
        if (dao.saveOrDelete(new District(id, name, new Province(province)), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, String name, String province) {
        if (dao.saveOrDelete(new District(id, name, new Province(province)), false)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }
}
