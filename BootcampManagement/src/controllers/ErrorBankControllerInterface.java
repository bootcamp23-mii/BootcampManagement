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
public interface ErrorBankControllerInterface {
    public ErrorBank getByid(String id);
    public List<ErrorBank> getAll();
    public List<ErrorBank> search(Object keyword);
    public String save(String id, String submitdate, String description, String solution, String classtype, String employee);
    public String delete(String id, String submitdate, String description, String solution, String classtype, String employee);
}
