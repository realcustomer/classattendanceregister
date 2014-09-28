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

/**
 *
 * @author donkey
 */
@Entity
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String type;
    
    //foreign key gave erros
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_id")
    private Department department;

    private Course()
    {
        
    }
    
    private Course(Builder aThis) {
        this.id         =   aThis.id;
        this.name       =   aThis.name;
        this.type       =   aThis.type;
        this.department =   aThis.department;
    }
    
    public static class Builder
    {
                private Long id;
                private String name;
                private String type;
                private Department department;
                
                public Builder id(Long value)
                {
                   id = value;
                           return this;
                }
                public Builder name(String value)
                {
                   name = value;
                           return this;
                }
                public Builder type(String value)
                {
                   type = value;
                           return this;
                }
                
                public Builder department(Department value)
                {
                    department = value;
                    return this;
                }
                public Builder course(Course value)
                {
                    this.id         =  value.getId();
                    this.name       =  value.getName();
                    this.type       =  value.getType();
                   this.department =  value.getDepartment();
                    
                    return this;
                }
                public Course build()
                {
                    return new Course(this);
                }
    }
    

    public Long getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Department getDepartment() {
        return department;
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
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.classattendance.domain.course[ id=" + id + " ]";
    }
    
}
