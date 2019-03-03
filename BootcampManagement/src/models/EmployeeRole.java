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
@Table(name = "EMPLOYEE_ROLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeRole.findAll", query = "SELECT e FROM EmployeeRole e")
    , @NamedQuery(name = "EmployeeRole.findById", query = "SELECT e FROM EmployeeRole e WHERE e.id = :id")
    , @NamedQuery(name = "EmployeeRole.findByStartdate", query = "SELECT e FROM EmployeeRole e WHERE e.startdate = :startdate")
    , @NamedQuery(name = "EmployeeRole.findByEnddate", query = "SELECT e FROM EmployeeRole e WHERE e.enddate = :enddate")})
public class EmployeeRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "STARTDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "ENDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;
    @JoinColumn(name = "ROLE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Role role;

    public EmployeeRole() {
    }

    public EmployeeRole(String id) {
        this.id = id;
    }

    public EmployeeRole(String id, Date startdate, Date enddate, Employee employee, Role role) {
        this.id = id;
        this.startdate = startdate;
        this.enddate = enddate;
        this.employee = employee;
        this.role = role;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
        if (!(object instanceof EmployeeRole)) {
            return false;
        }
        EmployeeRole other = (EmployeeRole) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.EmployeeRole[ id=" + id + " ]";
    }
    
}
