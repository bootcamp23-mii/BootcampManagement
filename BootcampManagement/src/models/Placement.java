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
@Table(name = "PLACEMENT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Placement.findAll", query = "SELECT p FROM Placement p")
    , @NamedQuery(name = "Placement.findById", query = "SELECT p FROM Placement p WHERE p.id = :id")
    , @NamedQuery(name = "Placement.findByDescription", query = "SELECT p FROM Placement p WHERE p.description = :description")
    , @NamedQuery(name = "Placement.findByAddress", query = "SELECT p FROM Placement p WHERE p.address = :address")
    , @NamedQuery(name = "Placement.findByDepartment", query = "SELECT p FROM Placement p WHERE p.department = :department")
    , @NamedQuery(name = "Placement.findByStartdate", query = "SELECT p FROM Placement p WHERE p.startdate = :startdate")
    , @NamedQuery(name = "Placement.findByFinishdate", query = "SELECT p FROM Placement p WHERE p.finishdate = :finishdate")
    , @NamedQuery(name = "Placement.findByIsdeleted", query = "SELECT p FROM Placement p WHERE p.isdeleted = :isdeleted")})
public class Placement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "DEPARTMENT")
    private String department;
    @Column(name = "STARTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "FINISHDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date finishdate;
    @Column(name = "ISDELETED")
    private Short isdeleted;
    @JoinColumn(name = "COMPANY", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public Placement() {
    }

    public Placement(String id) {
        this.id = id;
    }

    public Placement(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Placement(String id, String description, String address, String department, Date startdate, Short isdeleted, Company company, Employee employee) {
        this.id = id;
        this.description = description;
        this.address = address;
        this.department = department;
        this.startdate = startdate;
        this.isdeleted = isdeleted;
        this.company = company;
        this.employee = employee;
    }

    public Placement(String id, String description, String address, String department, Date startdate, Date finishdate, Short isdeleted, Company company, Employee employee) {
        this.id = id;
        this.description = description;
        this.address = address;
        this.department = department;
        this.startdate = startdate;
        this.finishdate = finishdate;
        this.isdeleted = isdeleted;
        this.company = company;
        this.employee = employee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(Date finishdate) {
        this.finishdate = finishdate;
    }

    public Short getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(Short isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
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
        if (!(object instanceof Placement)) {
            return false;
        }
        Placement other = (Placement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Placement[ id=" + id + " ]";
    }
    
}
