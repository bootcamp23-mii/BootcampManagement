/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.District;
import models.Subdistrict;

/**
 *
 * @author Firsta
 */
interface SubDistrictControllerInterface {
    public Subdistrict getById(String id);
    public List<Subdistrict> getAll();
    public List<Subdistrict> search (Object keyword);
    public String save(String id, String name, String district);
    public String delete(String id, String name, String district);
}
