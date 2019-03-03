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
@Table(name = "EDUCATION_HISTORY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EducationHistory.findAll", query = "SELECT e FROM EducationHistory e")
    , @NamedQuery(name = "EducationHistory.findById", query = "SELECT e FROM EducationHistory e WHERE e.id = :id")
    , @NamedQuery(name = "EducationHistory.findByGpa", query = "SELECT e FROM EducationHistory e WHERE e.gpa = :gpa")})
public class EducationHistory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "GPA")
    private String gpa;
    @JoinColumn(name = "EDUCATION", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Education education;
    @JoinColumn(name = "EMPLOYEE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

    public EducationHistory() {
    }

    public EducationHistory(String id) {
        this.id = id;
    }

    public EducationHistory(String id, String gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
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
        if (!(object instanceof EducationHistory)) {
            return false;
        }
        EducationHistory other = (EducationHistory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.EducationHistory[ id=" + id + " ]";
    }
    
}
