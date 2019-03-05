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
 * @author Pandu
 */
public class OrganizationController implements OrganizationControllerInterface {

    private DAOInterface<Organization> dao;

    public OrganizationController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Organization.class);
    }

    @Override
    public Organization getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Organization> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Organization> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public List<Organization> searchWD(Object keyword) {
        return dao.getDataWD(keyword,0);
    }

    @Override
    public String save(String id, String name, String employee) {
        if (dao.saveOrDelete(new Organization(id, name, new Short("0"), new Employee(employee)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id,String name, String employee) {
        if (dao.saveOrDelete(new Organization(id, name, new Short("0"), new Employee(employee)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }

    @Override
    public String deleteSoft(String id,String name, String employee) {
        String tempID="";
        List<Organization> dataList = searchWD("");
        for (Organization data : dataList) {
            if (data.getName().equals(name)
                    &&data.getEmployee().getId().equals(employee)
                    )tempID=data.getId();
        }
        if (dao.saveOrDelete(new Organization(tempID, name, new Short("1"), new Employee(employee)), true)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
