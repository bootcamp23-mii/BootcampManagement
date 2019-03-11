/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.*;

/**
 *
 * @author gerydanu
 */
public interface EvaluationControllerInterface {
    public Evaluation getByid(String id);
    public List<Evaluation> getAll();
    public List<Evaluation> search(Object keyword);
    public List<Evaluation> searchWD(Object keyword);
    public String save(String id, String isdaily, String evaluationdate, String note, String participant, String lesson, String topic);
    public String delete(String id, String isdaily, String evaluationdate, String note, String participant, String lesson, String topic);
    public String deleteSoft(String id, String isdaily, String evaluationdate, String note, String participant, String lesson, String topic);
}
