/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import models.District;
import models.Employee;
import models.Religion;
import models.Village;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class EmployeeController {
     private GeneralDAO gdao;
     
     public EmployeeController(SessionFactory factory){
         gdao = new GeneralDAO(factory, Employee.class);
     }
     
     public String insert(String id, String name, String birthdate, String gender, String marriedstatus, String address, String email, String phone, String onboarddate, String password, String securityqestion, String securityanswer, String isdeleted, String hiringlocation, String birthplace, String religion, String village){
         if(gdao.saveOrDelete(new Employee(id, name, new Date(birthdate), gender, marriedstatus, address, email, phone, new Date(onboarddate), password, securityqestion, securityanswer, new Short("0"), new District(hiringlocation), new District(birthplace), new Religion(religion), new Village(village)), true)){
            return "Save Data Success";
         }else{
            return "Save Failed";
         }
     }
     
     public String update (String id, String name, String birthdate, String gender, String marriedstatus, String address, String email, String phone, String onboarddate, String password, String securityqestion, String securityanswer, String isdeleted, String hiringlocation, String birthplace, String religion, String village){
         if(gdao.saveOrDelete(new Employee(id, name, new Date(birthdate), gender, marriedstatus, address, email, phone, new Date(onboarddate), password, securityqestion, securityanswer, new Short("0"), new District(hiringlocation), new District(birthplace), new Religion(religion), new Village(village)), true)){
            return "Save Data Success";
         }else{
            return "Save Failed";
         }
     }
     
     public String delete(String id, String name, String birthdate, String gender, String marriedstatus, String address, String email, String phone, String onboarddate, String password, String securityqestion, String securityanswer, String isdeleted, String hiringlocation, String birthplace, String religion, String village){
         if(gdao.saveOrDelete(new Employee(id, name, new Date(birthdate), gender, marriedstatus, address, email, phone, new Date(onboarddate), password, securityqestion, securityanswer, new Short("0"), new District(hiringlocation), new District(birthplace), new Religion(religion), new Village(village)), true)){
            return "Delete Data Success";
         }else{
            return "Delete Failed";
         }
     }
     
     public List<Employee> getAll(){   
        return gdao.getData("");
    }
    
    public List<Employee> search(Object keyword){
        return gdao.getData(keyword);
    }
    
}
