/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.math.BigInteger;
import java.util.List;
import models.Locker;

/**
 *
 * @author Firsta
 */
interface LockerControllerInterface {
    public Locker getById (String id);
    public List<Locker> getAll();
    public List<Locker> search(Object keyword);
    public String save(String id, BigInteger lockernumber, String locker);
    public String delete(String id, BigInteger lockernumber, String locker);
}
