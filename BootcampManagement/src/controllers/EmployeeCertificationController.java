/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author Pandu
 */
public class EmployeeCertificationController implements EmployeeCertificationControllerInterface {

    private DAOInterface<EmployeeCertification> dao;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

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
    public List<EmployeeCertification> searchWD(Object keyword) {
        return dao.getDataWD(keyword,0);
    }

    @Override
    public String save(String id, String certificateDate, String certificateNumber, String certificate, String employee) {
        try {
            if (dao.saveOrDelete(new EmployeeCertification(id, dateFormat.parse(certificateDate), certificateNumber, new Short("0"), new Certificate(certificate), new Employee(employee)), true)) {
                return "Save Data Success!";
            }
        } catch (ParseException ex) {
            Logger.getLogger(EmployeeCertificationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Save Failed!";
    }

    @Override
    public String delete(String id, String certificateDate, String certificateNumber, String certificate, String employee) {
        try {
            if (dao.saveOrDelete(new EmployeeCertification(id, dateFormat.parse(certificateDate), certificateNumber, new Short("0"), new Certificate(certificate), new Employee(employee)), false)) {
                return "Delete Data Success!";
            }
        } catch (ParseException ex) {
            Logger.getLogger(EmployeeCertificationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete Failed!";
    }

    @Override
    public String deleteSoft(String id, String certificateDate, String certificateNumber, String certificate, String employee) {
        String tempID="";
        List<EmployeeCertification> dataList = searchWD("");
        for (EmployeeCertification data : dataList) {
            if (dateFormat.format(data.getCertificatedate()).equals(certificateDate)
                    &&data.getCertificatenumber().equals(certificateNumber)
                    &&data.getCertificate().getId().equals(certificate)
                    &&data.getEmployee().getId().equals(employee)
                    )tempID=data.getId();
        }
        try {
            if (dao.saveOrDelete(new EmployeeCertification(tempID, dateFormat.parse(certificateDate), certificateNumber, new Short("1"), new Certificate(certificate), new Employee(employee)), true)) {
                return "Delete Data Success!";
            }
        } catch (ParseException ex) {
            Logger.getLogger(EmployeeCertificationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Delete Failed!";
    }
}
