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
public class AchievementController implements AchievementControllerInterface {

    private DAOInterface<Achievement> dao;

    public AchievementController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Achievement.class);
    }

    @Override
    public Achievement getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Achievement> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Achievement> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String employee) {
        if (dao.saveOrDelete(new Achievement(id, name, new Employee(employee)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id,String name, String employee) {
        if (dao.saveOrDelete(new Achievement(id, name, new Employee(employee)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
