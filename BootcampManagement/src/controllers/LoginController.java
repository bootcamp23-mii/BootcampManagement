/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.*;
import java.sql.Connection;
import java.util.List;
import models.*;
import org.hibernate.SessionFactory;
import tools.BCrypt;

/**
 *
 * @author Panji Sadewo
 */
public class LoginController {
    
    private DAOInterface<Employee> dao;

    public LoginController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Employee.class);
    }
    
    public boolean login(String username, String password){
        List<Employee> list = dao.login(username);
        if (!list.isEmpty()) 
            for (Employee user : list) 
                if (BCrypt.checkpw(password, user.getPassword())) 
                    return true;
        return false;
    }
    
//    public String register(String username, String password){
//        String result = "";
//        String passhash = BCrypt.hashpw(password, BCrypt.gensalt());
//        if (dao.saveOrDelete(new Employee(username, passhash), true)){
//            result = "Registrasi Berhasil";            
//        }else{
//            result = "Maaf registrasi gagal";
//        }
//        return result;
//    }
    
}
