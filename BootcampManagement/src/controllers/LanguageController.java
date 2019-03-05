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
public class LanguageController implements LanguageControllerInterface {

    private DAOInterface<Language> dao;

    public LanguageController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Language.class);
    }

    @Override
    public Language getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Language> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Language> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name) {
        if (dao.saveOrDelete(new Language("", name), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String name) {
        if (dao.saveOrDelete(new Language("", name), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
