/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.List;
import models.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author Pandu
 */
public class EducationController implements EducationControllerInterface {

    private DAOInterface<Education> dao;

    public EducationController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Education.class);
    }

    @Override
    public Education getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Education> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Education> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String degree, String major, String university) {
        if (dao.saveOrDelete(new Education("", new Short("0"), new Degree(degree), new Major(major), new University(university)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String degree, String major, String university) {
        if (dao.saveOrDelete(new Education("", new Short("0"), new Degree(degree), new Major(major), new University(university)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
