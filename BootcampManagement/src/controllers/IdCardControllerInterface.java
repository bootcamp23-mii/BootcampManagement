/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Date;
import java.util.List;
import models.IdCard;

/**
 *
 * @author Firsta
 */
interface IdCardControllerInterface {
    public IdCard getByid(String id);
    public List<IdCard> getAll();
    public List<IdCard> search(Object keyword);
    public String save(String id, Date receivedate, String employee);
    public String delete(String id, Date receivedate, String employee);
}
