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
@Table(name = "EMPLOYEE_CERTIFICATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeCertification.findAll", query = "SELECT e FROM EmployeeCertification e")
    , @NamedQuery(name = "EmployeeCertification.findById", query = "SELECT e FROM EmployeeCertification e WHERE e.id = :id")
    , @NamedQuery(name = "EmployeeCertification.findByCertificatedate", query = "SELECT e FROM EmployeeCertification e WHERE e.certificatedate = :certificatedate")
    , @NamedQuery(name = "EmployeeCertification.findByCertificatenumber", query = "SELECT e FROM EmployeeCertification e WHERE e.certificatenumber = :certificatenumber")
    , @NamedQuery(name = "EmployeeCertification.findAll", query = "SELECT e FROM EmployeeCertification e")
    , @NamedQuery(name = "EmployeeCertification.findById", query = "SELECT e FROM EmployeeCertification e WHERE e.id = :id")})        
public class EmployeeCertification implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "CERTIFICATEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date certificatedate;
    @Column(name = "CERTIFICATENUMBER")
    private String certificatenumber;
    @JoinColumn(name = "CERTIFICATE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Certificate certificate;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public EmployeeCertification() {
    }

    public EmployeeCertification(String id) {
        this.id = id;
    }

    public EmployeeCertification(String id, Date certificatedate, String certificatenumber, Certificate certificate, Employee employee) {
        this.id = id;
        this.certificatedate = certificatedate;
        this.certificatenumber = certificatenumber;
        this.certificate = certificate;
        this.employee = employee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCertificatedate() {
        return certificatedate;
    }

    public void setCertificatedate(Date certificatedate) {
        this.certificatedate = certificatedate;
    }

    public String getCertificatenumber() {
        return certificatenumber;
    }

    public void setCertificatenumber(String certificatenumber) {
        this.certificatenumber = certificatenumber;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
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
        if (!(object instanceof EmployeeCertification)) {
            return false;
        }
        EmployeeCertification other = (EmployeeCertification) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.EmployeeCertification[ id=" + id + " ]";
    }
    
}
