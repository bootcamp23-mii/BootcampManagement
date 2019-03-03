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
@Table(name = "VILLAGE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Village.findAll", query = "SELECT v FROM Village v")
    , @NamedQuery(name = "Village.findById", query = "SELECT v FROM Village v WHERE v.id = :id")
    , @NamedQuery(name = "Village.findByName", query = "SELECT v FROM Village v WHERE v.name = :name")})
public class Village implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @OneToMany(mappedBy = "village", fetch = FetchType.LAZY)
    private List<Employee> employeeList;
    @OneToMany(mappedBy = "village", fetch = FetchType.LAZY)
    private List<Company> companyList;
    @JoinColumn(name = "SUBDISTRICT", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Subdistrict subdistrict;
    @OneToMany(mappedBy = "village", fetch = FetchType.LAZY)
    private List<University> universityList;

    public Village() {
    }

    public Village(String id) {
        this.id = id;
    }

    public Village(String id, String name) {
        this.id = id;
        this.name = name;
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

    @XmlTransient
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @XmlTransient
    public List<Company> getCompanyList() {
        return companyList;
    }

    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

    public Subdistrict getSubdistrict() {
        return subdistrict;
    }

    public void setSubdistrict(Subdistrict subdistrict) {
        this.subdistrict = subdistrict;
    }

    @XmlTransient
    public List<University> getUniversityList() {
        return universityList;
    }

    public void setUniversityList(List<University> universityList) {
        this.universityList = universityList;
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
        if (!(object instanceof Village)) {
            return false;
        }
        Village other = (Village) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Village[ id=" + id + " ]";
    }
    
}
