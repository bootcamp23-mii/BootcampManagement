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
public class CertificateController implements CertificateControllerInterface {

    private DAOInterface<Certificate> dao;

    public CertificateController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, Certificate.class);
    }

    @Override
    public Certificate getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Certificate> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Certificate> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String name) {
        if (dao.saveOrDelete(new Certificate(id, name), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String name) {
        if (dao.saveOrDelete(new Certificate(id, name), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
