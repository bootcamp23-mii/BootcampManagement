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
public interface LanguageControllerInterface {
    public Language getByid(String id);
    public List<Language> getAll();
    public List<Language> search(Object keyword);
    public String save(String id, String name);
    public String delete(String id, String name);
}
