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
@Table(name = "ID_CARD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "IdCard.findAll", query = "SELECT i FROM IdCard i")
    , @NamedQuery(name = "IdCard.findById", query = "SELECT i FROM IdCard i WHERE i.id = :id")
    , @NamedQuery(name = "IdCard.findByReceivedate", query = "SELECT i FROM IdCard i WHERE i.receivedate = :receivedate")})
public class IdCard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "RECEIVEDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receivedate;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public IdCard() {
    }

    public IdCard(String id) {
        this.id = id;
    }

    public IdCard(String id, Date receivedate) {
        this.id = id;
        this.receivedate = receivedate;
    }

    public IdCard(String id, Date receivedate, Employee employee) {
        this.id = id;
        this.receivedate = receivedate;
        this.employee = employee;
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
        if (!(object instanceof IdCard)) {
            return false;
        }
        IdCard other = (IdCard) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.IdCard[ id=" + id + " ]";
    }
    
}
