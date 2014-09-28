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
import javax.persistence.OneToMany;

/**
 *
 * @author donkey
 */
@Entity
public class Students implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   id;
    @Id
    private String studentNumber;
    private String name;
    private String surname;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "studentNumber")
    private List<Subjects> subjects;
        
    private Students()
    {
        
    }
    
    private Students(Builder aThis) {
        studentNumber  = aThis.studentNumber;
        name           = aThis.name;
        surname        = aThis.surname;
        subjects        =aThis.subjects;
    }
    public static class Builder
    {
        private String studentNumber;
        private String name;
        private String surname;
        private List<Subjects> subjects;
        
        public Builder studendNumber(String value)
        {
            studentNumber = value;
            return this;
        }
        public Builder name(String value)
        {
            name = value;
            return this;
        }
        public Builder subjects(List<Subjects> s)
        {
            subjects = s;
            return this;
        }
        public Builder surname(String value)
        {
            surname = value;
            return this;
        }
        public Builder students(Students value)
        {
            studentNumber   =   value.getStudentNumber();
            name            =   value.getName();
            surname         =   value.getSurname();
            subjects        = value.getSubjects();
            return this;
        }
        public Students build()
        {
            return new Students(this);
        }
    }
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }
    
    
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    
    public String getStudentNumber() {
        return studentNumber;
    }

    

    
    
}
