/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Date;
import java.util.List;
import models.AccessCard;
import models.Employee;
import models.EmployeeAccess;

/**
 *
 * @author Firsta
 */
    public interface EmployeeAccessControllerInterface {
    public EmployeeAccess getById (String id);
    public List<EmployeeAccess> getAll();
    public List<EmployeeAccess> search (Object keyword);
    public String save(String id, Date receivedate, Date returndate, String notes, String accesscard, String employee);
    public String delete(String id, Date receivedate, Date returndate, String notes, String accesscard, String employee);
}
