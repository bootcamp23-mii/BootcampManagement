/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.List;
import models.Subdistrict;
import models.Village;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class VillageController implements VillageControllerInterface{
    private DAOInterface <Village> dao;
    
    public VillageController(SessionFactory factory){
        dao = new GeneralDAO<>(factory, Village.class);
    }

    @Override
    public Village getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Village> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Village> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String subdistrict) {
        if (dao.saveOrDelete(new Village(id, name, new Subdistrict(subdistrict)), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, String name, String subdistrict) {
        if (dao.saveOrDelete(new Village(id, name, new Subdistrict(subdistrict)), false)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }
}
