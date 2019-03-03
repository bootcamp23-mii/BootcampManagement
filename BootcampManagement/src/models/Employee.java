/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author FES
 */
@Entity
@Table(name = "EMPLOYEE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
    , @NamedQuery(name = "Employee.findById", query = "SELECT e FROM Employee e WHERE e.id = :id")
    , @NamedQuery(name = "Employee.findByName", query = "SELECT e FROM Employee e WHERE e.name = :name")
    , @NamedQuery(name = "Employee.findByBirthdate", query = "SELECT e FROM Employee e WHERE e.birthdate = :birthdate")
    , @NamedQuery(name = "Employee.findByGender", query = "SELECT e FROM Employee e WHERE e.gender = :gender")
    , @NamedQuery(name = "Employee.findByMarriedstatus", query = "SELECT e FROM Employee e WHERE e.marriedstatus = :marriedstatus")
    , @NamedQuery(name = "Employee.findByEmail", query = "SELECT e FROM Employee e WHERE e.email = :email")
    , @NamedQuery(name = "Employee.findByPhone", query = "SELECT e FROM Employee e WHERE e.phone = :phone")
    , @NamedQuery(name = "Employee.findByOnboarddate", query = "SELECT e FROM Employee e WHERE e.onboarddate = :onboarddate")
    , @NamedQuery(name = "Employee.findByPassword", query = "SELECT e FROM Employee e WHERE e.password = :password")
    , @NamedQuery(name = "Employee.findBySecurityqestion", query = "SELECT e FROM Employee e WHERE e.securityqestion = :securityqestion")
    , @NamedQuery(name = "Employee.findBySecurityanswer", query = "SELECT e FROM Employee e WHERE e.securityanswer = :securityanswer")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "BIRTHDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthdate;
    @Basic(optional = false)
    @Column(name = "GENDER")
    private String gender;
    @Basic(optional = false)
    @Column(name = "MARRIEDSTATUS")
    private String marriedstatus;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "PHONE")
    private String phone;
    @Basic(optional = false)
    @Column(name = "ONBOARDDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date onboarddate;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @Basic(optional = false)
    @Column(name = "SECURITYQESTION")
    private String securityqestion;
    @Basic(optional = false)
    @Column(name = "SECURITYANSWER")
    private String securityanswer;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Organization> organizationList;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EmployeeCertification> employeeCertificationList;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EmployeeLanguage> employeeLanguageList;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<ErrorBank> errorBankList;
    @OneToMany(mappedBy = "trainer", fetch = FetchType.LAZY)
    private List<BatchClass> batchClassList;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EmployeeAccess> employeeAccessList;
    @JoinColumn(name = "RELIGION", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Religion religion;
    @JoinColumn(name = "VILLAGE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Village village;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EmployeeLocker> employeeLockerList;
    @OneToMany(mappedBy = "member1", fetch = FetchType.LAZY)
    private List<Evaluation> evaluationList;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<WorkExperience> workExperienceList;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EducationHistory> educationHistoryList;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Achievement> achievementList;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<Placement> placementList;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EmployeeSkill> employeeSkillList;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<EmployeeRole> employeeRoleList;
    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)
    private List<IdCard> idCardList;

    public Employee() {
    }

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String id, String name, Date birthdate, String gender, String marriedstatus, String email, String phone, Date onboarddate, String password, String securityqestion, String securityanswer) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.gender = gender;
        this.marriedstatus = marriedstatus;
        this.email = email;
        this.phone = phone;
        this.onboarddate = onboarddate;
        this.password = password;
        this.securityqestion = securityqestion;
        this.securityanswer = securityanswer;
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

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarriedstatus() {
        return marriedstatus;
    }

    public void setMarriedstatus(String marriedstatus) {
        this.marriedstatus = marriedstatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getOnboarddate() {
        return onboarddate;
    }

    public void setOnboarddate(Date onboarddate) {
        this.onboarddate = onboarddate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityqestion() {
        return securityqestion;
    }

    public void setSecurityqestion(String securityqestion) {
        this.securityqestion = securityqestion;
    }

    public String getSecurityanswer() {
        return securityanswer;
    }

    public void setSecurityanswer(String securityanswer) {
        this.securityanswer = securityanswer;
    }

    @XmlTransient
    public List<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(List<Organization> organizationList) {
        this.organizationList = organizationList;
    }

    @XmlTransient
    public List<EmployeeCertification> getEmployeeCertificationList() {
        return employeeCertificationList;
    }

    public void setEmployeeCertificationList(List<EmployeeCertification> employeeCertificationList) {
        this.employeeCertificationList = employeeCertificationList;
    }

    @XmlTransient
    public List<EmployeeLanguage> getEmployeeLanguageList() {
        return employeeLanguageList;
    }

    public void setEmployeeLanguageList(List<EmployeeLanguage> employeeLanguageList) {
        this.employeeLanguageList = employeeLanguageList;
    }

    @XmlTransient
    public List<ErrorBank> getErrorBankList() {
        return errorBankList;
    }

    public void setErrorBankList(List<ErrorBank> errorBankList) {
        this.errorBankList = errorBankList;
    }

    @XmlTransient
    public List<BatchClass> getBatchClassList() {
        return batchClassList;
    }

    public void setBatchClassList(List<BatchClass> batchClassList) {
        this.batchClassList = batchClassList;
    }

    @XmlTransient
    public List<EmployeeAccess> getEmployeeAccessList() {
        return employeeAccessList;
    }

    public void setEmployeeAccessList(List<EmployeeAccess> employeeAccessList) {
        this.employeeAccessList = employeeAccessList;
    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public Village getVillage() {
        return village;
    }

    public void setVillage(Village village) {
        this.village = village;
    }

    @XmlTransient
    public List<EmployeeLocker> getEmployeeLockerList() {
        return employeeLockerList;
    }

    public void setEmployeeLockerList(List<EmployeeLocker> employeeLockerList) {
        this.employeeLockerList = employeeLockerList;
    }

    @XmlTransient
    public List<Evaluation> getEvaluationList() {
        return evaluationList;
    }

    public void setEvaluationList(List<Evaluation> evaluationList) {
        this.evaluationList = evaluationList;
    }

    @XmlTransient
    public List<WorkExperience> getWorkExperienceList() {
        return workExperienceList;
    }

    public void setWorkExperienceList(List<WorkExperience> workExperienceList) {
        this.workExperienceList = workExperienceList;
    }

    @XmlTransient
    public List<EducationHistory> getEducationHistoryList() {
        return educationHistoryList;
    }

    public void setEducationHistoryList(List<EducationHistory> educationHistoryList) {
        this.educationHistoryList = educationHistoryList;
    }

    @XmlTransient
    public List<Achievement> getAchievementList() {
        return achievementList;
    }

    public void setAchievementList(List<Achievement> achievementList) {
        this.achievementList = achievementList;
    }

    @XmlTransient
    public List<Placement> getPlacementList() {
        return placementList;
    }

    public void setPlacementList(List<Placement> placementList) {
        this.placementList = placementList;
    }

    @XmlTransient
    public List<EmployeeSkill> getEmployeeSkillList() {
        return employeeSkillList;
    }

    public void setEmployeeSkillList(List<EmployeeSkill> employeeSkillList) {
        this.employeeSkillList = employeeSkillList;
    }

    @XmlTransient
    public List<EmployeeRole> getEmployeeRoleList() {
        return employeeRoleList;
    }

    public void setEmployeeRoleList(List<EmployeeRole> employeeRoleList) {
        this.employeeRoleList = employeeRoleList;
    }

    @XmlTransient
    public List<IdCard> getIdCardList() {
        return idCardList;
    }

    public void setIdCardList(List<IdCard> idCardList) {
        this.idCardList = idCardList;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Employee[ id=" + id + " ]";
    }
    
}
