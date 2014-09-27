/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.customer.classattendance.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author donkey
 */
@Entity
public class StudentSubjects implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //foreign keys
    //private List<Subjects> subjects;
    //private List<Students> students;

    private StudentSubjects(Builder aThis) {
        id          =   aThis.id;
        //subjects    =   aThis.subjects;
        //students    =   aThis.students;
    }
    
    public static class Builder
    {
        private Long id;
        //private List<Subjects> subjects;
        //private List<Students> students;
        
        public Builder id(Long value)
        {
            id = value;
            return this;
        }
        /*
        public Builder subjects(List<Subjects> value)
        {
            subjects = value;
            return this;
        }
        */
        /*
        public Builder students(List<Students> value)
        {
            students = value;
            return this;
        }
        */
        public Builder studentSubjects(StudentSubjects value)
        {
            id          =   value.getId();
            //subjects    =   value.getSubjects();
            //students    =   value.getStudents();
            return this;
        }
        public StudentSubjects build()
        {
            return new StudentSubjects(this);
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /*
    public List<Subjects> getSubjects() {
        return subjects;
    }

    public List<Students> getStudents() {
        return students;
    }
    */
    

    public Long getId() {
        return id;
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
        if (!(object instanceof StudentSubjects)) {
            return false;
        }
        StudentSubjects other = (StudentSubjects) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.classattendance.domain.studentSubjects[ id=" + id + " ]";
    }
    
}
