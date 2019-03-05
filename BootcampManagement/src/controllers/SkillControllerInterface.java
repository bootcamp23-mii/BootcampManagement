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
public interface SkillControllerInterface {
    public Skill getByid(String id);
    public List<Skill> getAll();
    public List<Skill> search(Object keyword);
    public String save(String id, String name, String category);
    public String delete(String id, String name, String category);
}
