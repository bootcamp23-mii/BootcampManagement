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
public interface ClassTypeControllerInterface {
    public ClassType getByid(String id);
    public List<ClassType> getAll();
    public List<ClassType> search(Object keyword);
    public String save(String id, String classtype);
    public String delete(String id, String classtype);
}
