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
@Table(name = "ACCESS_CARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccessCard.findAll", query = "SELECT a FROM AccessCard a")
    , @NamedQuery(name = "AccessCard.findById", query = "SELECT a FROM AccessCard a WHERE a.id = :id")
    , @NamedQuery(name = "AccessCard.findByAccessnumber", query = "SELECT a FROM AccessCard a WHERE a.accessnumber = :accessnumber")})
public class AccessCard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "ACCESSNUMBER")
    private String accessnumber;
    @OneToMany(mappedBy = "accesscard", fetch = FetchType.LAZY)
    private List<EmployeeAccess> employeeAccessList;

    public AccessCard() {
    }

    public AccessCard(String id) {
        this.id = id;
    }

    public AccessCard(String id, String accessnumber) {
        this.id = id;
        this.accessnumber = accessnumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccessnumber() {
        return accessnumber;
    }

    public void setAccessnumber(String accessnumber) {
        this.accessnumber = accessnumber;
    }

    @XmlTransient
    public List<EmployeeAccess> getEmployeeAccessList() {
        return employeeAccessList;
    }

    public void setEmployeeAccessList(List<EmployeeAccess> employeeAccessList) {
        this.employeeAccessList = employeeAccessList;
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
        if (!(object instanceof AccessCard)) {
            return false;
        }
        AccessCard other = (AccessCard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.AccessCard[ id=" + id + " ]";
    }
    
}
