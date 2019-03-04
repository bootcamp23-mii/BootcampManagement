/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.List;
import models.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author gerydanu
 */
public class RoomController implements RoomControllerInterface {
    private DAOInterface<Room> dao;

    public RoomController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Room.class);
    }

    @Override
    public Room getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Room> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Room> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name) {
        if (dao.saveOrDelete(new Room(id, name), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String name) {
        if (dao.saveOrDelete(new Room(id, name), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
