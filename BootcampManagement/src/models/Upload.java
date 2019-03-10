/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.awt.Image;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import oracle.sql.BLOB;

/**
 *
 * @author FES
 */
@Entity
@Table(name = "UPLOAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Upload.findAll", query = "SELECT u FROM Upload u")
    , @NamedQuery(name = "Upload.findById", query = "SELECT u FROM Upload u WHERE u.id = :id")
    , @NamedQuery(name = "Upload.findByPhoto", query = "SELECT u FROM Upload u WHERE u.photo = :photo")})
public class Upload implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "PHOTO")
    private Serializable photo;

    public Upload() {
    }

    public Upload(String id) {
        this.id = id;
    }

    public Upload(String id, Serializable photo) {
        this.id = id;
        this.photo = photo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Serializable getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Upload)) {
            return false;
        }
        Upload other = (Upload) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Upload[ id=" + id + " ]";
    }
    
}
