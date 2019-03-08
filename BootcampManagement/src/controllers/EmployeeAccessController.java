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
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
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
    public String save(String id, String receivedate, String returndate, String notes, String accesscard, String employee) {
        try {
            if(dao.saveOrDelete(new EmployeeAccess(id, dateFormat.parse(receivedate), dateFormat.parse(returndate), notes, new AccessCard(accesscard), new Employee(employee)), true)){
                return "Save Data Success";
            }
        } catch (ParseException ex) {
            Logger.getLogger(EmployeeAccessController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Save Failed";
    }

    @Override
    public String delete(String id, String receivedate, String returndate, String notes, String accesscard, String employee) {
         try {
            if(dao.saveOrDelete(new EmployeeAccess(id, dateFormat.parse(receivedate), dateFormat.parse(returndate), notes, new AccessCard(accesscard), new Employee(employee)), false)){
                return "Delete Data Success";
            }
        } catch (ParseException ex) {
            Logger.getLogger(EmployeeAccessController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete Failed";
    }
}
