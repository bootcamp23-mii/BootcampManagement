/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.Date;
import java.util.List;
import models.Company;
import models.Employee;
import models.Placement;

/**
 *
 * @author Firsta
 */
interface PlacementControllerInterface {
    public Placement getById (String id);
    public List<Placement> getALL();
    public List<Placement> search(Object keyword);
    public String save(String id, String description, String address, String department, Date startdate, Date finishdate, String company, String employee);
    public String delete(String id, String description, String address, String department, Date startdate, Date finishdate, String company, String employee);
}
