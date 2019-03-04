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
public class EmployeeRoleController implements EmployeeRoleControllerInterface {

    private DAOInterface<EmployeeRole> dao;

    public EmployeeRoleController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, EmployeeRole.class);
    }

    @Override
    public EmployeeRole getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<EmployeeRole> getAll() {
        return dao.getData("");
    }

    @Override
    public List<EmployeeRole> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String startDate, String endDate, String employee, String role) {
        if (dao.saveOrDelete(new EmployeeRole(id, new Date(startDate), new Date(endDate), new Employee(employee), new Role(role)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String startDate, String endDate, String employee, String role) {
        if (dao.saveOrDelete(new EmployeeRole(id, new Date(startDate), new Date(endDate), new Employee(employee), new Role(role)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
