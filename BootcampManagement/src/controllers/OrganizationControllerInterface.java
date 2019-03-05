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
public interface OrganizationControllerInterface {
    public Organization getByid(String id);
    public List<Organization> getAll();
    public List<Organization> search(Object keyword);
    public List<Organization> searchWD(Object keyword);
    public String save(String id, String name, String employee);
    public String delete(String id, String gpa, String employee);
    public String deleteSoft(String id, String gpa, String employee);
}
