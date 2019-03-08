/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Date;
import java.util.List;
import models.Employee;
import models.EmployeeLocker;
import models.Locker;

/**
 *
 * @author Firsta
 */
    public interface EmployeeLockerControllerInterface {
    public EmployeeLocker getById (String id);
    public List<EmployeeLocker> getAll();
    public List<EmployeeLocker> search (Object keyword);
    public String save(String id, String receivedate, String returndate, String notes, String employee, String locker);
    public String delete(String id, String receivedate, String returndate, String notes, String employee, String locker);
}
