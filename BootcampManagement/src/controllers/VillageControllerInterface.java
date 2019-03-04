/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import models.Subdistrict;
import models.Village;

/**
 *
 * @author Firsta
 */
interface VillageControllerInterface {
    public Village getById (String id);
    public List<Village> getAll();
    public List<Village> search (Object keyword);
    public String save (String id, String name, String subdistrict);
    public String delete (String id, String name, String subdistrict);
}
