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
import models.Company;
import models.Employee;
import models.Placement;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class PlacementController implements PlacementControllerInterface{
    private DAOInterface <Placement> dao;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    
    public PlacementController(SessionFactory factory){
       dao = new GeneralDAO<>(factory, Placement.class);
    }

    @Override
    public Placement getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Placement> getAll() {
       return dao.getData("");
    }

    @Override
    public List<Placement> search(Object keyword) {
       return dao.getData(keyword);
    }
    
     @Override
    public List<Placement> searchWD(Object keyword) {
        return dao.getDataWD(keyword, 0);
    }
    
    @Override
    public String save(String id, String description, String address, String department, String startdate, String finishdate, String company, String employee) {
        try {
            if (dao.saveOrDelete(new Placement(id, description, address, department, dateFormat.parse(startdate), dateFormat.parse(finishdate), new Short("0"), new Company(company), new Employee(employee)), true)) {
                return "Save Data Success!";
            }
        } catch (ParseException ex) {
            Logger.getLogger(PlacementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Save Failed!";
    }

    @Override
    public String delete(String id, String description, String address, String department, String startdate, String finishdate, String company, String employee) {
        try {
            if (dao.saveOrDelete(new Placement(id, description, address, department, dateFormat.parse(startdate), dateFormat.parse(finishdate), new Short("0"), new Company(company), new Employee(employee)), true)) {
                return "Delete Data Success!";
            }
        } catch (ParseException ex) {
            Logger.getLogger(PlacementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete Failed!";
    }

    @Override
    public String deleteSoft(String id, String description, String address, String department, String startdate, String finishdate, String company, String employee) {
       String tempID="";
        List<Placement> dataList = searchWD("");
        for (Placement placement : dataList) {
           if (placement.getDescription().equals(description)
                    &&placement.getAddress().equals(address)
                    &&placement.getDepartment().equals(department)
                    &&dateFormat.format(placement.getStartdate()).equals(startdate)
                    &&dateFormat.format(placement.getFinishdate()).equals(finishdate)
                    &&placement.getCompany().getId().equals(company)
                    &&placement.getEmployee().getId().equals(employee)
                    )tempID=placement.getId();
        }
        try {
            if (dao.saveOrDelete(new Placement(tempID, description, address, department, dateFormat.parse(startdate), dateFormat.parse(finishdate), new Short("0"), new Company(company), new Employee(employee)), true)){
                return "Delete Data Success!";
            }
        } catch (ParseException ex) {
            Logger.getLogger(PlacementController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete Failed!";
    }
}
       
