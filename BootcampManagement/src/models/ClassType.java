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
@Table(name = "CLASS_TYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClassType.findAll", query = "SELECT c FROM ClassType c")
    , @NamedQuery(name = "ClassType.findById", query = "SELECT c FROM ClassType c WHERE c.id = :id")
    , @NamedQuery(name = "ClassType.findByClasstype", query = "SELECT c FROM ClassType c WHERE c.classtype = :classtype")})
public class ClassType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "CLASSTYPE")
    private String classtype;
    @OneToMany(mappedBy = "classtype", fetch = FetchType.LAZY)
    private List<ErrorBank> errorBankList;
    @OneToMany(mappedBy = "classType", fetch = FetchType.LAZY)
    private List<Lesson> lessonList;
    @OneToMany(mappedBy = "classtype", fetch = FetchType.LAZY)
    private List<BatchClass> batchClassList;

    public ClassType() {
    }

    public ClassType(String id) {
        this.id = id;
    }

    public ClassType(String id, String classtype) {
        this.id = id;
        this.classtype = classtype;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClasstype() {
        return classtype;
    }

    public void setClasstype(String classtype) {
        this.classtype = classtype;
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
        if (!(object instanceof ClassType)) {
            return false;
        }
        ClassType other = (ClassType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.ClassType[ id=" + id + " ]";
    }
    
}
