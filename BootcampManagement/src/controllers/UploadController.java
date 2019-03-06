/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.DAOInterface;
import daos.GeneralDAO;
import java.util.List;
import models.Subdistrict;
import models.Upload;
import models.Village;
import org.hibernate.SessionFactory;

/**
 *
 * @author Firsta
 */
public class UploadController implements UploadControllerInterface{
    private DAOInterface <Upload> dao;
    
    public UploadController(SessionFactory factory){
        dao = new GeneralDAO<>(factory, Upload.class);
    }

    @Override
    public Upload getById(String id) {
        return dao.getById(id);
    }

    @Override
    public List<Upload> getAll() {
        return dao.getData("");
    }

    @Override
    public List<Upload> search(Object keyword) {
        return dao.getData(keyword);
    }

    @Override
    public String save(String id, byte photo) {
        if (dao.saveOrDelete(new Upload(id, photo), true)) {
            return "Save Data Success";
        } else {
            return "Save Failed";
        }
    }

    @Override
    public String delete(String id, byte photo) {
        if (dao.saveOrDelete(new Upload(id, photo), false)) {
            return "Delete Data Success";
        } else {
            return "Delete Failed";
        }
    }
}
