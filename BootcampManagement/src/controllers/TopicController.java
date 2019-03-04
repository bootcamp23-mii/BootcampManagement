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
public class TopicController implements TopicControllerInterface {
    private DAOInterface<Topic> dao;

    public TopicController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, new Topic());
    }

    @Override
    public Topic getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Topic> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Topic> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name) {
        if (dao.saveOrDelete(new Topic(id, name), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id,String name) {
        if (dao.saveOrDelete(new Topic(id, name), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
