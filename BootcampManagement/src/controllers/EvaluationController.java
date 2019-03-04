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
public class EvaluationController implements EvaluationControllerInterface {
    private DAOInterface<Evaluation> dao;

    public EvaluationController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Evaluation.class);
    }

    @Override
    public Evaluation getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Evaluation> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Evaluation> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String isdaily, String evaluationdate, String note, String participant, String lesson, String topic) {
        if (dao.saveOrDelete(new Evaluation(id, new Short(isdaily), new Date(evaluationdate), note, new Employee(participant), new Lesson(lesson), new Topic(topic)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String isdaily, String evaluationdate, String note, String participant, String lesson, String topic) {
        if (dao.saveOrDelete(new Evaluation(id, new Short(isdaily), new Date(evaluationdate), note, new Employee(participant), new Lesson(lesson), new Topic(topic)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
