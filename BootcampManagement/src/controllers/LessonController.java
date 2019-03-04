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
 * @author gerydanu
 */
public class LessonController implements LessonControllerInterface {
    private DAOInterface<Lesson> dao;

    public LessonController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Lesson.class);
    }

    @Override
    public Lesson getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Lesson> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Lesson> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String classType) {
        if (dao.saveOrDelete(new Lesson(id, name, new ClassType(classType)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id,String name, String classType) {
        if (dao.saveOrDelete(new Lesson(id, name, new ClassType(classType)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
