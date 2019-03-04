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
public class EmployeeCertificationController implements EmployeeCertificationControllerInterface {

    private DAOInterface<EmployeeCertification> dao;

    public EmployeeCertificationController(SessionFactory factory) {
        dao = new GeneralDAO<>(factory, EmployeeCertification.class);
    }

    @Override
    public EmployeeCertification getByid(String id) {
        return dao.getById(id);
    }

    @Override
    public List<EmployeeCertification> getAll() {
        return dao.getData("");
    }

    @Override
    public List<EmployeeCertification> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, String certificateDate, String certificateNumber, String certificate, String employee) {
        if (dao.saveOrDelete(new EmployeeCertification(id, new Date(certificateDate), certificateNumber, new Certificate(certificate), new Employee(employee)), true)) {
            return "Save Data Success!";
        } else {
            return "Save Failed!";
        }
    }

    @Override
    public String delete(String id, String certificateDate, String certificateNumber, String certificate, String employee) {
        if (dao.saveOrDelete(new EmployeeCertification(id, new Date(certificateDate), certificateNumber, new Certificate(certificate), new Employee(employee)), false)) {
            return "Delete Data Success!";
        } else {
            return "Delete Failed!";
        }
    }
}
