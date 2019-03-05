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
public interface AchievementControllerInterface {
    public Achievement getByid(String id);
    public List<Achievement> getAll();
    public List<Achievement> search(Object keyword);
    public List<Achievement> searchWD(Object keyword);
    public String save(String id, String name, String employee);
    public String delete(String id, String name, String employee);
    public String deleteSoft(String id, String name, String employee);
}
