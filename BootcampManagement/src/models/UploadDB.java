/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.InputStream;
import java.sql.Blob;

/**
 *
 * @author FES
 */
public class UploadDB {
    private String id;
    private InputStream photo;

    public UploadDB() {
    }
    
    public UploadDB(String id, InputStream photo) {
        this.id = id;
        this.photo = photo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InputStream getPhoto() {
        return photo;
    }

    public void setPhoto(InputStream photo) {
        this.photo = photo;
    }
    
    
}
