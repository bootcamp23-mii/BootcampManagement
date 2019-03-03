/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FES
 */
@Entity
@Table(name = "EDUCATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Education.findAll", query = "SELECT e FROM Education e")
    , @NamedQuery(name = "Education.findById", query = "SELECT e FROM Education e WHERE e.id = :id")})
public class Education implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @JoinColumn(name = "DEGREE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Degree degree;
    @JoinColumn(name = "MAJOR", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Major major;
    @JoinColumn(name = "UNIVERSITY", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private University university;
    @OneToMany(mappedBy = "education", fetch = FetchType.LAZY)
    private List<EducationHistory> educationHistoryList;

    public Education() {
    }

    public Education(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    @XmlTransient
    public List<EducationHistory> getEducationHistoryList() {
        return educationHistoryList;
    }

    public void setEducationHistoryList(List<EducationHistory> educationHistoryList) {
        this.educationHistoryList = educationHistoryList;
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
        if (!(object instanceof Education)) {
            return false;
        }
        Education other = (Education) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Education[ id=" + id + " ]";
    }
    
}
