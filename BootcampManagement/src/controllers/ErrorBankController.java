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
 * @author gerydanu
 */
public class ErrorBankController implements ErrorBankControllerInterface {
    private DAOInterface<ErrorBank> dao;

    public ErrorBankController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, new ErrorBank());
    }

    @Override
    public ErrorBank getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<ErrorBank> getAll() {
        return dao.getData("");
    }

    @Override
    public List<ErrorBank> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String submitdate, String description, String solution, String classtype, String employee) {
        if (dao.saveOrDelete(new ErrorBank(id, new Date(submitdate), description, solution, new ClassType(classtype), new Employee(employee)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String submitdate, String description, String solution, String classtype, String employee) {
        if (dao.saveOrDelete(new ErrorBank(id, new Date(submitdate), description, solution, new ClassType(classtype), new Employee(employee)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
