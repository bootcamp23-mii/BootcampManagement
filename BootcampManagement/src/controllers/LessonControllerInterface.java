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
public interface LessonControllerInterface {
    public Lesson getByid(String id);
    public List<Lesson> getAll();
    public List<Lesson> search(Object keyword);
    public String save(String id, String name, String classType);
    public String delete(String id, String name, String classType);
}
