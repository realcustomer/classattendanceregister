/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.customer.classattendance.repository;

import com.customer.classattendance.domain.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author donkey
 */
public interface LecturerRepository extends JpaRepository<Lecturer, Long>{
    
}
