/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Company;
import models.Village;

/**
 *
 * @author Firsta
 */
interface CompanyControllerInterface {
    public Company getById(String id);
    public List<Company> getAll();
    public List<Company> search(Object keyword);
    public String save(String id, String name, String address, String phone, String village);
    public String delete(String id, String name, String address, String phone, String village);
}
