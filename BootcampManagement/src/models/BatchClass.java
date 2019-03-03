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
@Table(name = "BATCH_CLASS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BatchClass.findAll", query = "SELECT b FROM BatchClass b")
    , @NamedQuery(name = "BatchClass.findById", query = "SELECT b FROM BatchClass b WHERE b.id = :id")})
public class BatchClass implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @OneToMany(mappedBy = "batchclass", fetch = FetchType.LAZY)
    private List<Participant> participantList;
    @JoinColumn(name = "BATCH", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Batch batch;
    @JoinColumn(name = "CLASSTYPE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ClassType classtype;
    @JoinColumn(name = "TRAINER", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee trainer;
    @JoinColumn(name = "ROOM", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Room room;

    public BatchClass() {
    }

    public BatchClass(String id) {
        this.id = id;
    }

    public BatchClass(String id, Batch batch, ClassType classtype, Employee trainer, Room room) {
        this.id = id;
        this.batch = batch;
        this.classtype = classtype;
        this.trainer = trainer;
        this.room = room;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @XmlTransient
    public List<Participant> getParticipantList() {
        return participantList;
    }

    public void setParticipantList(List<Participant> participantList) {
        this.participantList = participantList;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public ClassType getClasstype() {
        return classtype;
    }

    public void setClasstype(ClassType classtype) {
        this.classtype = classtype;
    }

    public Employee getTrainer() {
        return trainer;
    }

    public void setTrainer(Employee trainer) {
        this.trainer = trainer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
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
        if (!(object instanceof BatchClass)) {
            return false;
        }
        BatchClass other = (BatchClass) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.BatchClass[ id=" + id + " ]";
    }
    
}
