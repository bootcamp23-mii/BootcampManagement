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
 * @author Pandu
 */
public interface WorkExperienceControllerInterface {
    public WorkExperience getByid(String id);
    public List<WorkExperience> getAll();
    public List<WorkExperience> search(Object keyword);
    public String save(String id, String name, String description, String startDate, String endDate, String employee);
    public String delete(String id, String name, String description, String startDate, String endDate, String employee);
}
