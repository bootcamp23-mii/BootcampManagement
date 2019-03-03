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
@Table(name = "ERROR_BANK")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ErrorBank.findAll", query = "SELECT e FROM ErrorBank e")
    , @NamedQuery(name = "ErrorBank.findById", query = "SELECT e FROM ErrorBank e WHERE e.id = :id")
    , @NamedQuery(name = "ErrorBank.findBySubmitdate", query = "SELECT e FROM ErrorBank e WHERE e.submitdate = :submitdate")
    , @NamedQuery(name = "ErrorBank.findByDescription", query = "SELECT e FROM ErrorBank e WHERE e.description = :description")
    , @NamedQuery(name = "ErrorBank.findBySolution", query = "SELECT e FROM ErrorBank e WHERE e.solution = :solution")})
public class ErrorBank implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "SUBMITDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date submitdate;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "SOLUTION")
    private String solution;
    @JoinColumn(name = "CLASS", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Class class1;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public ErrorBank() {
    }

    public ErrorBank(String id) {
        this.id = id;
    }

    public ErrorBank(String id, Date submitdate) {
        this.id = id;
        this.submitdate = submitdate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Date submitdate) {
        this.submitdate = submitdate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }

    public Class getClass1() {
        return class1;
    }

    public void setClass1(Class class1) {
        this.class1 = class1;
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
        if (!(object instanceof ErrorBank)) {
            return false;
        }
        ErrorBank other = (ErrorBank) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.ErrorBank[ id=" + id + " ]";
    }
    
}
