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
import models.AccessCard;
import models.Employee;
import models.EmployeeAccess;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class EmployeeAccessController implements EmployeeAccessControllerInterface{
    private DAOInterface <EmployeeAccess> dao;
    
    public EmployeeAccessController (SessionFactory factory){
        dao = new GeneralDAO<>(factory, EmployeeAccess.class);
    }

    @Override
    public EmployeeAccess getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<EmployeeAccess> getAll() {
        return dao.getData("");
    }

    @Override
    public List<EmployeeAccess> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, Date receivedate, Date returndate, String notes, String accesscard, String employee) {
        if (dao.saveOrDelete(new EmployeeAccess(id, receivedate, returndate, notes, new AccessCard(accesscard), new Employee(employee)), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, Date receivedate, Date returndate, String notes, String accesscard, String employee) {
        if (dao.saveOrDelete(new EmployeeAccess(id, receivedate, returndate, notes, new AccessCard(accesscard), new Employee(employee)), false)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }
}
