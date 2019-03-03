/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FES
 */
@Entity
@Table(name = "ACHIEVEMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Achievement.findAll", query = "SELECT a FROM Achievement a")
    , @NamedQuery(name = "Achievement.findById", query = "SELECT a FROM Achievement a WHERE a.id = :id")
    , @NamedQuery(name = "Achievement.findByName", query = "SELECT a FROM Achievement a WHERE a.name = :name")})
public class Achievement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public Achievement() {
    }

    public Achievement(String id) {
        this.id = id;
    }

    public Achievement(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Achievement(String id, String name, Employee employee) {
        this.id = id;
        this.name = name;
        this.employee = employee;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
        if (!(object instanceof Achievement)) {
            return false;
        }
        Achievement other = (Achievement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Achievement[ id=" + id + " ]";
    }
    
}
