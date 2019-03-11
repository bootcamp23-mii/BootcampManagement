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
public interface ParticipantControllerInterface {
    public Participant getByid(String id);
    public List<Participant> getAll();
    public List<Participant> search(Object keyword);
    public List<Participant> searchWD(Object keyword);
    public String save(String id, String grade, String batchclass, String employee);
    public String delete(String id, String grade, String batchclass, String employee);
    public String deleteSoft(String id, String grade, String batchclass, String employee);
}
