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
public class Faculty implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    
    private Faculty()
    {
        
    }

    private Faculty(Builder aThis) {
        this.id   = aThis.id;
        this.name = aThis.name;
    }
    
    public static class Builder
    {
        private Long id;
        private String name;
        
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
        public Builder faculty(Faculty value)
        {
            this.id   = value.getId();
            this.name = value.getName();
            return this;
        }
        public Faculty build()
        {
            return new Faculty(this);
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
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Faculty)) {
            return false;
        }
        Faculty other = (Faculty) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.classattendance.domain.faculty[ id=" + id + " ]";
    }
    
}
