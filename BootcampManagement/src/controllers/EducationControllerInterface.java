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
public interface EducationControllerInterface {
    public Education getByid(String id);
    public List<Education> getAll();
    public List<Education> search(Object keyword);
    public String save(String id, String degree, String major, String university);
    public String delete(String id, String degree, String major, String university);
}
