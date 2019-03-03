/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FES
 */
@Entity
@Table(name = "DISTRICT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "District.findAll", query = "SELECT d FROM District d")
    , @NamedQuery(name = "District.findById", query = "SELECT d FROM District d WHERE d.id = :id")
    , @NamedQuery(name = "District.findByName", query = "SELECT d FROM District d WHERE d.name = :name")})
public class District implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @JoinColumn(name = "PROVINCE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Province province;
    @OneToMany(mappedBy = "district", fetch = FetchType.LAZY)
    private List<Subdistrict> subdistrictList;

    public District() {
    }

    public District(String id) {
        this.id = id;
    }

    public District(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public District(String id, String name, Province province) {
        this.id = id;
        this.name = name;
        this.province = province;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    @XmlTransient
    public List<Subdistrict> getSubdistrictList() {
        return subdistrictList;
    }

    public void setSubdistrictList(List<Subdistrict> subdistrictList) {
        this.subdistrictList = subdistrictList;
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
        if (!(object instanceof District)) {
            return false;
        }
        District other = (District) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.District[ id=" + id + " ]";
    }
    
}
