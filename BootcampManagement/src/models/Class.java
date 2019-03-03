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
@Table(name = "CLASS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Class.findAll", query = "SELECT c FROM Class c")
    , @NamedQuery(name = "Class.findById", query = "SELECT c FROM Class c WHERE c.id = :id")
    , @NamedQuery(name = "Class.findByClass1", query = "SELECT c FROM Class c WHERE c.class1 = :class1")})
public class Class implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "CLASS")
    private String class1;
    @OneToMany(mappedBy = "class1", fetch = FetchType.LAZY)
    private List<ErrorBank> errorBankList;
    @OneToMany(mappedBy = "class1", fetch = FetchType.LAZY)
    private List<Lesson> lessonList;
    @OneToMany(mappedBy = "class1", fetch = FetchType.LAZY)
    private List<BatchClass> batchClassList;

    public Class() {
    }

    public Class(String id) {
        this.id = id;
    }

    public Class(String id, String class1) {
        this.id = id;
        this.class1 = class1;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }

    @XmlTransient
    public List<ErrorBank> getErrorBankList() {
        return errorBankList;
    }

    public void setErrorBankList(List<ErrorBank> errorBankList) {
        this.errorBankList = errorBankList;
    }

    @XmlTransient
    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    @XmlTransient
    public List<BatchClass> getBatchClassList() {
        return batchClassList;
    }

    public void setBatchClassList(List<BatchClass> batchClassList) {
        this.batchClassList = batchClassList;
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
        if (!(object instanceof Class)) {
            return false;
        }
        Class other = (Class) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Class[ id=" + id + " ]";
    }
    
}
