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
@Table(name = "PARTICIPANT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Participant.findAll", query = "SELECT p FROM Participant p")
    , @NamedQuery(name = "Participant.findById", query = "SELECT p FROM Participant p WHERE p.id = :id")
    , @NamedQuery(name = "Participant.findByGrade", query = "SELECT p FROM Participant p WHERE p.grade = :grade")})
public class Participant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "GRADE")
    private String grade;
    @JoinColumn(name = "BATCHCLASS", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private BatchClass batchclass;

    public Participant() {
    }

    public Participant(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public BatchClass getBatchclass() {
        return batchclass;
    }

    public void setBatchclass(BatchClass batchclass) {
        this.batchclass = batchclass;
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
        if (!(object instanceof Participant)) {
            return false;
        }
        Participant other = (Participant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Participant[ id=" + id + " ]";
    }
    
}
