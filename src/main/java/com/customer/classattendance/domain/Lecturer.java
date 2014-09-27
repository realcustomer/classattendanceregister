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
public class Lecturer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;
    private String  office;
    private String  name;
    private String  telephone;
    private String  email;
    
    //foreign Key
    //private List<ClassLecture> classLucture;
    
    
    
    private Lecturer()
    {
                
    }

    private Lecturer(Builder aThis) 
    {
        this.id           =   aThis.id;
        this.name         =   aThis.name;
        this.office       =   aThis.office;
        this.telephone    =   aThis.telephone;
        this.email        =   aThis.email;
        //this.classLucture =   aThis.classLucture;
        
    }
    
    public static class Builder
    {
         private Long    id;
         private String  name;
         private String  office;
         private String  telephone;
         private String  email;
         //private List<ClassLecture> classLucture;
         
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
         public Builder office(String value)
         {
             this.office = value;
             return this;
         }
         public Builder telephone(String value)
         {
             this.telephone = value;
             return this;
         }
         public Builder email(String value)
         {
             this.email = value;
             return this;
         }
         /*
         public Builder classLecture(List<ClassLecture> value)
         {
             this.classLucture = value;
             return this;
         }
         */
         
         public Builder lecture(Lecturer value)
         {
             this.id            =   value.getId();
             this.name          =   value.getName();
             this.office        =   value.getOffice();
             this.telephone     =   value.getTelephone();
             this.email         =   value.getEmail();
             //this.classLucture  =   value.getClassLucture();
             return this;
         }
         public Lecturer build()
         {
             return new Lecturer(this);
         }
         
         
    }
/*
    public List<ClassLecture> getClassLucture() {
        return classLucture;
    }
  */  
    
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOffice() {
        return office;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
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
        if (!(object instanceof Lecturer)) {
            return false;
        }
        Lecturer other = (Lecturer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.paballo.classattendance.domain.venue[ id=" + id + " ]";
    }
    
}
