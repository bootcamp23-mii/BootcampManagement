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
public class EducationHistoryController implements EducationHistoryControllerInterface {

    private DAOInterface<EducationHistory> dao;

    public EducationHistoryController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, EducationHistory.class);
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
    public List<EducationHistory> searchWD(Object keyword) {
        return dao.getDataWD(keyword,0);
    }

    @Override
    public String save(String id, String gpa, String education, String employee) {
        if (dao.saveOrDelete(new EducationHistory(id, gpa, new Short("0"), new Education(education),new Employee(employee)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String gpa, String education, String employee) {
        if (dao.saveOrDelete(new EducationHistory(id, gpa, new Short("0"), new Education(education), new Employee(employee)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
    
    @Override
    public String deleteSoft(String id, String gpa, String education, String employee) {
        String tempID="";
        List<EducationHistory> dataList = searchWD("");
        for (EducationHistory data : dataList) {
            if (data.getGpa().equals(gpa)
                    &&data.getEducation().getId().equals(education)
                    &&data.getEmployee().getId().equals(employee)
                    )tempID=data.getId();
        }
        if (dao.saveOrDelete(new EducationHistory(tempID, gpa, new Short("1"), new Education(education), new Employee(employee)), true)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
