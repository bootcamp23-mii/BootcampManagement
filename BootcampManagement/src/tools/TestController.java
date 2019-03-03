/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import controllers.EducationHistoryController;
import controllers.EducationHistoryControllerInterface;
import models.*;
import org.hibernate.SessionFactory;

/**
 *
 * @author FES
 */
public class TestController {
    public static void main(String[] args) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        EducationHistoryControllerInterface eh = new EducationHistoryController(factory);
//        System.out.println(eh.save("", "4.0", "CVE1", "14303"));
        System.out.println(eh.getByid("CVEH1").getId());
    }
}
