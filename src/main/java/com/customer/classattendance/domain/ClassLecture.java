/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.customer.classattendance.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
//import org.apache.derby.client.am.DateTime;
//import org.apache.derby.client.am.DateTime;
import org.joda.time.DateTime;


/**
 *
 * @author donkey
 * 
 * I
 */
@Entity
public class ClassLecture implements Serializable { //??????????????????????????????????
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private DateTime dates;
    private DateTime startTime;
    private DateTime endTime;    
    
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "class_id")
    private Subjects subjects;
    
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "class_id")
    private List<Students> students;
    
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "class_id")
    private Lecturer lecturer;
    
    private ClassLecture()
    {
        
    }

    private ClassLecture(Builder aThis) {
        id          =   aThis.id;
        startTime   =   aThis.startTime;
        endTime     =   aThis.endTime;
        students = aThis.students;
        lecturer = aThis.lecturer;
        subjects = aThis.subjects;
    }
    
    public static class Builder
    {
        private Long id;
        private DateTime startTime;
        private DateTime endTime;
        
        private Lecturer lecturer;
        private List<Students> students;
        private Subjects subjects;
        
        public Builder()
        {
            
        }
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        public Builder subjects(Subjects s)
        {
            subjects = s;
            return this;
        }
        public Builder lecturer(Lecturer s)
        {
            lecturer = s;
            return this;
        }
        public Builder students(List<Students> s)
        {
            students = s;
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
            students = value.getStudents();
            lecturer = value.getLecturer();
            subjects = value.getSubjects();
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

    public Subjects getSubjects() {
        return subjects;
    }

    public List<Students> getStudents() {
        return students;
    }

    public Lecturer getLecturer() {
        return lecturer;
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
