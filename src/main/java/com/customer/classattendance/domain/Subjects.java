/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.customer.classattendance.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author donkey
 */
@Entity
public class Subjects implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    private String subjectId;
    private String name;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subject_id")
    private Course course;
    
    private Subjects(Builder aThis) {
        subjectId    = aThis.subjectId;
        name         = aThis.name;
        course       = aThis.course;
    }
    
    
    public static class Builder
    {
        private String subjectId;
        private String name;
    
        private Course course;
        
        public  Builder()
        {
            
        }
        
        public  Builder subjectId(String value)
        {
            subjectId  =   value;
            return this;
        }
        public  Builder name(String value)
        {
            name = value;
            return this;
        }
        
        public  Builder course(Course value)
        {
            course = value;
            return this;
        }
        
        public Builder Subjects(Subjects value)
        {
            subjectId       = value.getSubjectId();
            name            = value.getName();
            course          = value.getCourse();
            return this;
        }
        public Subjects build()
        {
            return new Subjects(this);
        }
    }

    public String getSubjectId() {
        return subjectId;
        
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }
    
    public Course getCourse() {
        return course;
    }
}
