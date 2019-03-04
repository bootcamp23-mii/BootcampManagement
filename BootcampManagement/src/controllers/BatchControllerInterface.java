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
public interface BatchControllerInterface {
    public Batch getByid(String id);
    public List<Batch> getAll();
    public List<Batch> search(Object keyword);
    public String save(String id, String name, String startdate, String enddate);
    public String delete(String id, String name, String startdate, String enddate);
}
