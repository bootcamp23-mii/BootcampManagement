/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author Pandu
 */
public class EmployeeRoleController implements EmployeeRoleControllerInterface {

    private DAOInterface<EmployeeRole> dao;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

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
    public List<EmployeeRole> searchWD(Object keyword) {
        return dao.getDataWD(keyword,0);
    }

    @Override
    public String save(String id, String startDate, String endDate, String employee, String role) {
        try {
            if (dao.saveOrDelete(new EmployeeRole(id, dateFormat.parse(startDate), dateFormat.parse(endDate), new Short("0"), new Employee(employee), new Role(role)), true)) 
                return "Save Data Success!";
        } catch (ParseException ex) {
            Logger.getLogger(EmployeeRoleController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Save Failed!";
    }

    @Override
    public String delete(String id, String startDate, String endDate, String employee, String role) {
        try {
            if (dao.saveOrDelete(new EmployeeRole(id, dateFormat.parse(startDate), dateFormat.parse(endDate), new Short("1"), new Employee(employee), new Role(role)), true)) 
                return "Delete Data Success!";
        } catch (ParseException ex) {
            Logger.getLogger(EmployeeRoleController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete Failed!";
    }
    
    @Override
    public String deleteSoft(String id, String startDate, String endDate, String employee, String role) {
        String tempID="";
        List<EmployeeRole> dataList = searchWD("");
        for (EmployeeRole data : dataList) {
            if (dateFormat.format(data.getStartdate()).equals(startDate)
                    &&dateFormat.format(data.getEnddate()).equals(endDate)
                    &&data.getRole().getId().equals(role)
                    &&data.getEmployee().getId().equals(employee)
                    )tempID=data.getId();
        }
        try {
            if (dao.saveOrDelete(new EmployeeRole(tempID, dateFormat.parse(startDate), dateFormat.parse(endDate), new Short("1"), new Employee(employee), new Role(role)), true)) 
                return "Delete Data Success!";
        } catch (ParseException ex) {
            Logger.getLogger(EmployeeRoleController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete Failed!";
    }
}
