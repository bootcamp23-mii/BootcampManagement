/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.Date;
import java.util.List;
import models.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author Pandu
 */
public class SkillController implements SkillControllerInterface {

    private DAOInterface<Skill> dao;

    public SkillController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Skill.class);
    }

    @Override
    public Skill getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Skill> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Skill> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name, String category) {
        if (dao.saveOrDelete(new Skill(id, name, new Category(category)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String name, String category) {
        if (dao.saveOrDelete(new Skill(id, name, new Category(category)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
