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
 * @author Pandu
 */
public class EmployeeLanguageController implements EmployeeLanguageControllerInterface {

    private DAOInterface<EmployeeLanguage> dao;

    public EmployeeLanguageController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, EmployeeLanguage.class);
    }

    @Override
    public EmployeeLanguage getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<EmployeeLanguage> getAll() {
        return dao.getData("");
    }

    @Override
    public List<EmployeeLanguage> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public List<EmployeeLanguage> searchWD(Object keyword) {
        return dao.getDataWD(keyword,0);
    }

    @Override
    public String save(String id, String employee, String language) {
        if (dao.saveOrDelete(new EmployeeLanguage(id, new Short("0"), new Employee(employee), new Language(language)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String employee, String language) {
        if (dao.saveOrDelete(new EmployeeLanguage(id, new Short("0"), new Employee(employee), new Language(language)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }

    @Override
    public String deleteSoft(String id, String employee, String language) {
        String tempID="";
        List<EmployeeLanguage> dataList = searchWD("");
        for (EmployeeLanguage data : dataList) {
            if (data.getEmployee().getId().equals(employee)
                    &&data.getLanguage().getId().equals(language)
                    )tempID=data.getId();
        }
        if (dao.saveOrDelete(new EmployeeLanguage(tempID, new Short("1"), new Employee(employee), new Language(language)), true)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
