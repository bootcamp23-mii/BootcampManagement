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
public class ScoreController implements ScoreControllerInterface {
    private DAOInterface<Score> dao;

    public ScoreController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, new Score());
    }

    @Override
    public Score getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Score> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Score> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String rating, String aspect, String evaluation) {
        if (dao.saveOrDelete(new Score(id, rating, new Aspect(aspect), new Evaluation(evaluation)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String rating, String aspect, String evaluation) {
        if (dao.saveOrDelete(new Score(id, rating, new Aspect(aspect), new Evaluation(evaluation)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
