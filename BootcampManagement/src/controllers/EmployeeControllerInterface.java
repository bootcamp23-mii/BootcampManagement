/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Date;
import java.util.List;
import models.District;
import models.Employee;
import models.Religion;
import models.Village;

/**
 *
 * @author Firsta
 */
    public interface EmployeeControllerInterface {
    public Employee getByid(String id);
    public List<Employee> getAll();
    public List<Employee> search(Object keyword);
    public String save(String id, String name, String birthdate, String gender, String marriedstatus, String address, String email, String phone, String onboarddate, String password, String securityqestion, String securityanswer, String isdeleted, String hiringlocation, String birthplace, String religion, String village);
    public String delete(String id, String name, String birthdate, String gender, String marriedstatus, String address, String email, String phone, String onboarddate, String password, String securityqestion, String securityanswer, String isdeleted, String hiringlocation, String birthplace, String religion, String village);
}
