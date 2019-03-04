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
public interface BatchClassControllerInterface {
    public BatchClass getByid(String id);
    public List<BatchClass> getAll();
    public List<BatchClass> search(Object keyword);
    public String save(String id, String isdeleted, String batch, String classes, String trainer, String room);
    public String delete(String id, String isdeleted, String batch, String classes, String trainer, String room);
}
