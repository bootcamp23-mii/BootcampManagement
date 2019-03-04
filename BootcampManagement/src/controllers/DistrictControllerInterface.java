/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.District;
import models.Province;

/**
 *
 * @author Firsta
 */
interface DistrictControllerInterface {
    public District getById(String id);
    public List<District> getAll();
    public List<District> search(Object keyword);
    public String save(String id, String name, String province);
    public String delete(String id, String name, String province);
}
