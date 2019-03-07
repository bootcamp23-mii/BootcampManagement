/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.awt.Image;
import java.io.Serializable;
import java.util.List;
import models.Subdistrict;
import models.Upload;
import models.Village;
import oracle.sql.BLOB;

/**
 *
 * @author Firsta
 */
    public interface UploadControllerInterface {
    public Upload getById (String id);
    public List<Upload> getAll();
    public List<Upload> search (Object keyword);
    public String save (String id, byte[] photo);
    public String delete (String id, byte[] photo);
}
