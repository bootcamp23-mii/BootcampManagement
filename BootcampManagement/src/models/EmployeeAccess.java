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
@Table(name = "EMPLOYEE_ACCESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeAccess.findAll", query = "SELECT e FROM EmployeeAccess e")
    , @NamedQuery(name = "EmployeeAccess.findById", query = "SELECT e FROM EmployeeAccess e WHERE e.id = :id")
    , @NamedQuery(name = "EmployeeAccess.findByReceivedate", query = "SELECT e FROM EmployeeAccess e WHERE e.receivedate = :receivedate")
    , @NamedQuery(name = "EmployeeAccess.findByReturndate", query = "SELECT e FROM EmployeeAccess e WHERE e.returndate = :returndate")
    , @NamedQuery(name = "EmployeeAccess.findByNotes", query = "SELECT e FROM EmployeeAccess e WHERE e.notes = :notes")})
public class EmployeeAccess implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "RECEIVEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedate;
    @Column(name = "RETURNDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date returndate;
    @Column(name = "NOTES")
    private String notes;
    @JoinColumn(name = "ACCESSCARD", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private AccessCard accesscard;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public EmployeeAccess() {
    }

    public EmployeeAccess(String id) {
        this.id = id;
    }

    public EmployeeAccess(String id, Date receivedate) {
        this.id = id;
        this.receivedate = receivedate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(Date receivedate) {
        this.receivedate = receivedate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public AccessCard getAccesscard() {
        return accesscard;
    }

    public void setAccesscard(AccessCard accesscard) {
        this.accesscard = accesscard;
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
        if (!(object instanceof EmployeeAccess)) {
            return false;
        }
        EmployeeAccess other = (EmployeeAccess) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.EmployeeAccess[ id=" + id + " ]";
    }
    
}
