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
@Table(name = "CERTIFICATE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Certificate.findAll", query = "SELECT c FROM Certificate c")
    , @NamedQuery(name = "Certificate.findById", query = "SELECT c FROM Certificate c WHERE c.id = :id")
    , @NamedQuery(name = "Certificate.findByName", query = "SELECT c FROM Certificate c WHERE c.name = :name")})
public class Certificate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "certificate", fetch = FetchType.LAZY)
    private List<EmployeeCertification> employeeCertificationList;

    public Certificate() {
    }

    public Certificate(String id) {
        this.id = id;
    }

    public Certificate(String id, String name) {
        this.id = id;
        this.name = name;
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

    @XmlTransient
    public List<EmployeeCertification> getEmployeeCertificationList() {
        return employeeCertificationList;
    }

    public void setEmployeeCertificationList(List<EmployeeCertification> employeeCertificationList) {
        this.employeeCertificationList = employeeCertificationList;
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
        if (!(object instanceof Certificate)) {
            return false;
        }
        Certificate other = (Certificate) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Certificate[ id=" + id + " ]";
    }
    
}
