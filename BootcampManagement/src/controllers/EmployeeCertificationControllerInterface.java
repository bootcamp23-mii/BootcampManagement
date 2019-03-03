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
 * @author Pandu
 */
public interface EmployeeCertificationControllerInterface {
    public EmployeeCertification getByid(String id);
    public List<EmployeeCertification> getAll();
    public List<EmployeeCertification> search(Object keyword);
    public String save(String id, String certificateDate, String certificateNumber, String certificate, String employee);
    public String delete(String id, String certificateDate, String certificateNumber, String certificate, String employee);
}
