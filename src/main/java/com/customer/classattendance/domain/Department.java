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
public class Department implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String ContactDetails;
    
    //foreign Key
    //private List<Faculty> faculty;
    
    
    private Department()
    {
        
    }

    private Department(Builder aThis) {
        this.id             = aThis.id;
        this.name           = aThis.name;
        this.ContactDetails = aThis.ContactDetails;
        //this.faculty        = aThis.faculty;
        
    }
    public static class Builder
    {
        private Long id;
        private String name;
        private String ContactDetails;
        //foreign Key
        //private List<Faculty> faculty;
        
        public Builder()
        {
            
        }
        
        public Builder id(Long value)
        {
            this.id = value;
            return this;
        }
        public Builder name(String value)
        {
            this.name = value;
            return this;
        }
        public Builder contactDetails(String value)
        {
            this.ContactDetails = value;
            return this;
        }
        /*
        private Builder faculty(List<Faculty> value)
        {
            this.faculty = value;
            return this;
        }
        */
        public Builder department(Department value)
        {
            this.id             = value.getId();
            this.name           = value.getName();
            this.ContactDetails = value.getContactDetails();
           // this.faculty        = value.getFaculty();
            return this;
        }
        public Department build()
        {
            return new Department(this);
        }
        
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
/*
    public List<Faculty> getFaculty() {
        return faculty;
    }
  */  

    public String getName() {
        return name;
    }

    public String getContactDetails() {
        return ContactDetails;
    }
   

    
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
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.classattendance.domain.department[ id=" + id + " ]";
    }
    
}
