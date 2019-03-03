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
@Table(name = "SKILL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Skill.findAll", query = "SELECT s FROM Skill s")
    , @NamedQuery(name = "Skill.findById", query = "SELECT s FROM Skill s WHERE s.id = :id")
    , @NamedQuery(name = "Skill.findByName", query = "SELECT s FROM Skill s WHERE s.name = :name")})
public class Skill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @JoinColumn(name = "CATEGORY", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
    @OneToMany(mappedBy = "skill", fetch = FetchType.LAZY)
    private List<EmployeeSkill> employeeSkillList;

    public Skill() {
    }

    public Skill(String id) {
        this.id = id;
    }

    public Skill(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Skill(String id, String name, Category category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @XmlTransient
    public List<EmployeeSkill> getEmployeeSkillList() {
        return employeeSkillList;
    }

    public void setEmployeeSkillList(List<EmployeeSkill> employeeSkillList) {
        this.employeeSkillList = employeeSkillList;
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
        if (!(object instanceof Skill)) {
            return false;
        }
        Skill other = (Skill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Skill[ id=" + id + " ]";
    }
    
}
