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
    
    public PlacementController(SessionFactory factory){
       dao = new GeneralDAO<>(factory, Placement.class);
    }

    @Override
    public Placement getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Placement> getALL() {
       return dao.getData("");
    }

    @Override
    public List<Placement> search(Object keyword) {
       return dao.getData(keyword);
    }

    @Override
    public String save(String id, String isdeleted, String description, String address, String department, String startdate, String finishdate, String company, String employee) {
        if (dao.saveOrDelete(new Placement(id, description, address, department, new Date(startdate), new Date(finishdate), new Short("0"), new Company(company), new Employee(employee)), true)) {
            return "Save Data Success";
        }
        return "Save Failed";
    }

    @Override
    public String delete(String id, String isdeleted, String description, String address, String department, String startdate, String finishdate, String company, String employee) {
        if (dao.saveOrDelete(new Placement(id, description, address, department, new Date(startdate), new Date(finishdate), new Short("0"), new Company(company), new Employee(employee)), true)) {
            return "Delete Data Success";
        }
        return "Delete Failed";
    }

   

    
}
