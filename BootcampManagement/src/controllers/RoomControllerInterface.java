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
public interface RoomControllerInterface {
    public Room getByid(String id);
    public List<Room> getAll();
    public List<Room> search(Object keyword);
    public String save(String id, String name);
    public String delete(String id, String name);
}
