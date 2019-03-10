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
import models.District;
import models.Employee;
import models.Religion;
import models.Village;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class EmployeeController implements EmployeeControllerInterface{
     private DAOInterface<Employee> dao;
     private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
     
     public EmployeeController(SessionFactory factory){
         dao = new GeneralDAO(factory, Employee.class);
     }

    @Override
    public Employee getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Employee> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Employee> search(Object keyword) {
       return dao.getData(keyword);
    }

    @Override
    public List<Employee> searchWD(Object keyword) {
       return dao.getDataWD(keyword, 0);
    }
    
    @Override
    public String save(String id, String name, String birthdate, String gender, String marriedstatus, String address, String email, String phone, String onboarddate, String password, String securityqestion, String securityanswer, String hiringlocation, String birthplace, String religion, String village) {
        try {
            if(dao.saveOrDelete(new Employee(id, name, dateFormat.parse(birthdate), gender, marriedstatus, address, email, phone, dateFormat.parse(onboarddate), password, securityqestion, securityanswer, new Short("0"), new District(hiringlocation), new District(birthplace), new Religion(religion), new Village(village)), true)){
                return "Save Data Success";
            }
        } catch (ParseException ex) {
            Logger.getLogger(PlacementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Save Failed";
    }

    @Override
    public String delete(String id, String name, String birthdate, String gender, String marriedstatus, String address, String email, String phone, String onboarddate, String password, String securityqestion, String securityanswer, String hiringlocation, String birthplace, String religion, String village) {
        try {
            if(dao.saveOrDelete(new Employee(id, name, dateFormat.parse(birthdate), gender, marriedstatus, address, email, phone, dateFormat.parse(onboarddate), password, securityqestion, securityanswer, new Short("0"), new District(hiringlocation), new District(birthplace), new Religion(religion), new Village(village)), true)){
                return "Delete Data Success";
            }
        } catch (ParseException ex) {
            Logger.getLogger(PlacementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete Failed";
    }

    @Override
    public String deleteSoft(String id, String name, String birthdate, String gender, String marriedstatus, String address, String email, String phone, String onboarddate, String password, String securityqestion, String securityanswer, String hiringlocation, String birthplace, String religion, String village) {
    String tempID="";
        List<Employee> dataList = searchWD("");
        for (Employee employee : dataList) {
            if(employee.getName().equals(name)
            &&dateFormat.format(employee.getBirthdate()).equals(birthdate)
            &&employee.getGender().equals(gender)
            &&employee.getMarriedstatus().equals(marriedstatus)
            &&employee.getAddress().equals(address)
            &&employee.getEmail().equals(email)
            &&employee.getPhone().equals(phone)
            &&dateFormat.format(employee.getOnboarddate()).equals(onboarddate)
            &&employee.getPassword().equals(password)
            &&employee.getAddress().equals(address)
            &&employee.getSecurityqestion().equals(securityqestion)
            &&employee.getSecurityanswer().equals(securityanswer)
            &&employee.getHiringlocation().getId().equals(hiringlocation)
            &&employee.getBirthplace().getId().equals(birthplace)
            &&employee.getReligion().getId().equals(religion)
            &&employee.getVillage().getId().equals(village)
            )tempID=employee.getId();
        }
        try {
            if (dao.saveOrDelete(new Employee(tempID, name, dateFormat.parse(birthdate), gender, marriedstatus, address, email, phone, dateFormat.parse(onboarddate), password, securityqestion, securityanswer, new Short("0"), new District(hiringlocation), new District(birthplace), new Religion(religion), new Village(village)), true)){
                return "Delete Data Success!";
            }
            } catch (ParseException ex) {
            Logger.getLogger(EmployeeController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete Failed!";
    }
}
