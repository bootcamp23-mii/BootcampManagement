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
public interface ClassesControllerInterface {
    public Classes getByid(String id);
    public List<Classes> getAll();
    public List<Classes> search(Object keyword);
    public String save(String id, String classes);
    public String delete(String id, String classes);
}
