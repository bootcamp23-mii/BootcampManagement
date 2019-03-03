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
public interface EmployeeLanguageControllerInterface {
    public EmployeeLanguage getByid(String id);
    public List<EmployeeLanguage> getAll();
    public List<EmployeeLanguage> search(Object keyword);
    public String save(String id, String employee, String language);
    public String delete(String id, String employee, String language);
}
