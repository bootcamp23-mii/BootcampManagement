/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author gerydanu
 */
public class ScoreController implements ScoreControllerInterface {
    private DAOInterface<Score> dao;

    public ScoreController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Score.class);
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
    public List<Score> searchWD(Object keyword) {
        return dao.getDataWD(keyword,0);
    }

    @Override
    public String save(String id, String rating, String aspect, String evaluation) {
        if (dao.saveOrDelete(new Score(id, rating, new Short("0"),new Aspect(aspect), new Evaluation(evaluation)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    
    
    @Override
    public String delete(String id, String rating, String aspect, String evaluation) {
        if (dao.saveOrDelete(new Score(id, rating, new Short("1"),new Aspect(aspect), new Evaluation(evaluation)), true)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
    
    @Override
    public String deleteSoft(String id, String rating, String aspect, String evaluation) {
        String tempID="";
        List<Score> dataList = searchWD("");
        for (Score data : dataList) {
            if (data.getRating().equals(rating)
                    &&data.getAspect().equals(aspect)
                    &&data.getEvaluation().getId().equals(evaluation)
                    )tempID=data.getId();
        }
        if (dao.saveOrDelete(new Score(id, rating, new Short("1"), new Aspect(aspect), new Evaluation(evaluation)), true))
            return "Delete Data Success!";
        return "Delete Failed!";
    }
}
