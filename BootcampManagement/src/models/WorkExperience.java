/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author FES
 */
@Entity
@Table(name = "WORK_EXPERIENCE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WorkExperience.findAll", query = "SELECT w FROM WorkExperience w")
    , @NamedQuery(name = "WorkExperience.findById", query = "SELECT w FROM WorkExperience w WHERE w.id = :id")
    , @NamedQuery(name = "WorkExperience.findByName", query = "SELECT w FROM WorkExperience w WHERE w.name = :name")
    , @NamedQuery(name = "WorkExperience.findByDescription", query = "SELECT w FROM WorkExperience w WHERE w.description = :description")
    , @NamedQuery(name = "WorkExperience.findByStartdate", query = "SELECT w FROM WorkExperience w WHERE w.startdate = :startdate")
    , @NamedQuery(name = "WorkExperience.findByEnddate", query = "SELECT w FROM WorkExperience w WHERE w.enddate = :enddate")})
public class WorkExperience implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "STARTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Basic(optional = false)
    @Column(name = "ENDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public WorkExperience() {
    }

    public WorkExperience(String id) {
        this.id = id;
    }

    public WorkExperience(String id, String name, String description, Date startdate, Date enddate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startdate = startdate;
        this.enddate = enddate;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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
        if (!(object instanceof WorkExperience)) {
            return false;
        }
        WorkExperience other = (WorkExperience) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.WorkExperience[ id=" + id + " ]";
    }
    
}
