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
public interface ScoreControllerInterface {
    public Score getByid(String id);
    public List<Score> getAll();
    public List<Score> search(Object keyword);
    public List<Score> searchWD(Object keyword);
    public String save(String id, String rating, String aspect, String evaluation);
    public String delete(String id, String rating, String aspect, String evaluation);
    public String deleteSoft(String id, String rating, String aspect, String evaluation);
}
