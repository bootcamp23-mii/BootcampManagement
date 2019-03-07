/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.EducationHistoryController;
import controllers.EducationHistoryControllerInterface;
import controllers.EmployeeController;
import controllers.UploadController;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import models.*;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.query.JRHibernateQueryExecuterFactory;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.SessionFactory;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

/**
 *
 * @author FES
 */
public class TestController {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        EducationHistoryControllerInterface eh = new EducationHistoryController(factory);
        EmployeeController emp = new EmployeeController(factory);
        List<Employee> empList = emp.getAll();
//        UploadController up = new UploadController(factory);
////        byte temp = (byte) up.getById("14303").getPhoto();
//        FileInputStream file = new FileInputStream(up.getById("14303").getPhoto().toString()); 
//        ObjectInputStream in = new ObjectInputStream(file); 
//        System.out.println(in);
//        System.out.println(eh.save("", "4.0", "CVE1", "14303"));
//        System.out.println(eh.getByid("CVEH1").getEmployee().getName());
//        System.out.println();
//        try {
//            String fileName = "./src/reports/CV.jrxml";
//            String filetoFill = "./src/reports/CV.jasper";
//            JasperCompileManager.compileReport(fileName);
//            Map param = new HashMap();
////            param.put(JRHibernateQueryExecuterFactory.PARAMETER_HIBERNATE_SESSION, factory.openSession());
//            param.put("setID", 14303);
//            Connection conn = factory.getSessionFactoryOptions().getServiceRegistry().getService(ConnectionProvider.class).getConnection();
////            JasperFillManager.fillReport(filetoFill, param);
////            JasperPrint jp = JasperFillManager.fillReport(filetoFill, param);
//            JasperFillManager.fillReport(filetoFill, param, conn);
//            JasperPrint jp = JasperFillManager.fillReport(filetoFill, param, conn);
//            JasperViewer.viewReport(jp, true);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//            System.out.println(ex.toString());
//        }
        for (Employee employee : empList) {
            for (BatchClass batchClass : employee.getBatchClassList()) {
                System.out.println(batchClass.getTrainer().getName());
            }
        }
    }
}
