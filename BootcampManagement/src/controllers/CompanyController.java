/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.List;
import models.Company;
import models.Village;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class CompanyController implements CompanyControllerInterface{
    private DAOInterface <Company> dao;
    
    public CompanyController(SessionFactory factory){
        dao = new GeneralDAO<>(factory, Company.class);
    }

    @Override
    public Company getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Company> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Company> search(Object keyword) {
       return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String address, String phone, String village) {
        if (dao.saveOrDelete(new Company(id, name, address, phone, new Village(village)), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, String name, String address, String phone, String village) {
        if (dao.saveOrDelete(new Company(id, name, address, phone, new Village(village)), false)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }
}
