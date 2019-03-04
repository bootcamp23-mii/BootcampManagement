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
public class ParticipantController implements ParticipantControllerInterface {
    private DAOInterface<Participant> dao;

    public ParticipantController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, new Participant());
    }

    @Override
    public Participant getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Participant> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Participant> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String grade, String batchclass, String employee) {
        if (dao.saveOrDelete(new Participant(id, grade, new BatchClass(batchclass), new Employee(employee)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String grade, String batchclass, String employee) {
        if (dao.saveOrDelete(new Participant(id, grade, new BatchClass(batchclass), new Employee(employee)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
