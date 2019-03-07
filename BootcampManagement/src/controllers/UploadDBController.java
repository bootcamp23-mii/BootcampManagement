/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.UploadDAO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.List;
import models.UploadDB;

/**
 *
 * @author milhamafemi
 */
public class UploadDBController {

    private UploadDAO dao;
    private Connection connection;

    public UploadDBController(Connection connection) {
        dao = new UploadDAO(connection);
    }

    public String upload(String id, File photoFile) throws FileNotFoundException {
        String result = "";
        InputStream inputStream = new FileInputStream(photoFile);
        if (dao.upload(new UploadDB(id, inputStream))) {
            result = "selamat data berhasil disimpan";
        } else {
            result = "maaf, data tidak berhasil disimpan";
        }
        return result;
    }
    
    public String replace(String id, File photoFile) throws FileNotFoundException {
        String result = "";
        InputStream inputStream = new FileInputStream(photoFile);
        if (dao.replace(new UploadDB(id, inputStream))) {
            result = "Selamat data berhasil disimpan";
        } else {
            result = "maaf data gagal disimpan";
        }
        return result;
    }

    public List<UploadDB> seachBy(String key) {
        List result;
        result = dao.getData(key);
        return result;
    }

}
