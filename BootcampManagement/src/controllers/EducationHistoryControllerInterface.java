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
public interface EducationHistoryControllerInterface {
    public EducationHistory getByid(String id);
    public List<EducationHistory> getAll();
    public List<EducationHistory> search(Object keyword);
    public String save(String id, String gpa, String education, String employee);
    public String delete(String id, String gpa, String education, String employee);
}
