/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.customer.classattendance.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author donkey
 */
@Entity
public class Students implements Serializable {
    private static final long serialVersionUID = 1L;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long   id;
    @Id
    private String studentNumber;
    private String name;
    private String surname;

    private Students()
    {
        
    }

    private Students(Builder aThis) {
        studentNumber  = aThis.studentNumber;
        name           = aThis.name;
        surname        = aThis.surname;
    }
    public static class Builder
    {
        private String studentNumber;
        private String name;
        private String surname;
        
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
