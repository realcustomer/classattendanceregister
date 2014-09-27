/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.customer.classattendance.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
//import org.apache.derby.client.am.DateTime;
//import org.apache.derby.client.am.DateTime;
import org.joda.time.DateTime;


/**
 *
 * @author donkey
 */
@Entity
public class ClassLecture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private DateTime dates;
    private DateTime startTime;
    private DateTime endTime;
    
    private ClassLecture()
    {
        
    }

    private ClassLecture(Builder aThis) {
        id          =   aThis.id;
        startTime   =   aThis.startTime;
        endTime     =   aThis.endTime;
    }
    
    public static class Builder
    {
        private Long id;
        private DateTime startTime;
        private DateTime endTime;
        
        public Builder()
        {
            
        }
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder startTime(DateTime value)
        {
            startTime = value;
            return this;
        }
        public Builder endTime(DateTime value)
        {
            endTime = value;
            return this;
        }
        public Builder classLecture(ClassLecture value)
        {
            id          =   value.getId();
            startTime   =   value.getStartTime();
            endTime     =   value.getEndTime();
            return this;
        }
        public ClassLecture build()
        {
            return  new ClassLecture(this);
        }
    }

    public Long getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public DateTime getEndTime() {
        return endTime;
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
        if (!(object instanceof ClassLecture)) {
            return false;
        }
        ClassLecture other = (ClassLecture) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.classattendance.domain.lecturer[ id=" + id + " ]";
    }
    
}
