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
import models.Employee;
import models.EmployeeLocker;
import models.Locker;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class EmployeeLockerController implements EmployeeLockerControllerInterface{
    private DAOInterface <EmployeeLocker> dao;
    
    public EmployeeLockerController (SessionFactory factory){
        dao = new GeneralDAO<>(factory, EmployeeLocker.class);
    }

    @Override
    public EmployeeLocker getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<EmployeeLocker> getAll() {
        return dao.getData("");
    }

    @Override
    public List<EmployeeLocker> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, Date receivedate, Date returndate, String notes, String employee, String locker) {
        if (dao.saveOrDelete(new EmployeeLocker(id, receivedate, returndate, notes, new Employee(employee), new Locker(locker)), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, Date receivedate, Date returndate, String notes, String employee, String locker) {
        if (dao.saveOrDelete(new EmployeeLocker(id, receivedate, returndate, notes, new Employee(employee), new Locker(locker)), false)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }
}
