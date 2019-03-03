/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.*;

/**
 *
 * @author Pandu
 */
public interface EmployeeRoleControllerInterface {
    public EmployeeRole getByid(String id);
    public List<EmployeeRole> getAll();
    public List<EmployeeRole> search(Object keyword);
    public String save(String id, String startDate, String endDate, String employee, String role);
    public String delete(String id, String startDate, String endDate, String employee, String role);
}
