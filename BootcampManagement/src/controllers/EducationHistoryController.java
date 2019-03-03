/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.math.BigDecimal;
import java.util.List;
import models.Education;
import models.EducationHistory;
import org.hibernate.SessionFactory;

/**
 *
 * @author Pandu
 */
public class EducationHistoryController implements EducationHistoryControllerInterface {

    private DAOInterface<EducationHistory> dao;

    public EducationHistoryController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, new EducationHistory());
    }

    @Override
    public EducationHistory getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<EducationHistory> getAll() {
        return dao.getData("");
    }

    @Override
    public List<EducationHistory> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String GPA, String region) {
        if (dao.saveOrDelete(new EducationHistory(id, , new Region(new Education(region))), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id) {
        if (dao.saveOrDelete(new Country(id), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
