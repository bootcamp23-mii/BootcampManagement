/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.AccessCard;

/**
 *
 * @author Firsta
 */
    public interface AccessCardControllerInterface {
    public AccessCard getById(String id);
    public List<AccessCard> getAll();
    public List<AccessCard> search(Object keyword);
    public String save (String id, String accessnumber);
    public String delete (String id, String accessnumber);
}
