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
import models.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author Pandu
 */
public class WorkExperienceController implements WorkExperienceControllerInterface {

    private DAOInterface<WorkExperience> dao;

    public WorkExperienceController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, WorkExperience.class);
    }

    @Override
    public WorkExperience getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<WorkExperience> getAll() {
        return dao.getData("");
    }

    @Override
    public List<WorkExperience> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String description, String startDate, String endDate, String employee) {
        if (dao.saveOrDelete(new WorkExperience(id, name, description, new Date(startDate), new Date(endDate), new Short("0"), new Employee(employee)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String name, String description, String startDate, String endDate, String employee) {
        if (dao.saveOrDelete(new WorkExperience(id, name, description, new Date(startDate), new Date(endDate), new Short("0"), new Employee(employee)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
