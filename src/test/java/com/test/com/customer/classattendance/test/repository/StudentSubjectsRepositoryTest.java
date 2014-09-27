/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.com.customer.classattendance.test.repository;

import com.customer.classattendance.domain.StudentSubjects;
import com.customer.classattendance.repository.StudentSubjectsRepository;
import com.test.com.customer.classattendance.test.ConnectionConfigTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author donkey
 */
public class StudentSubjectsRepositoryTest {
     public static ApplicationContext ctx;
     private StudentSubjectsRepository repo;
     private Long id;
     private StudentSubjects ssj;
     
    public StudentSubjectsRepositoryTest() {
    }

    @Test
    public void create() {
    repo = ctx.getBean(StudentSubjectsRepository.class);
    ssj = new StudentSubjects.Builder()
                             .build();
    repo.save(ssj);
    id = ssj.getId();
    Assert.assertNotNull(ssj);
    
    
    }
    @Test
    public void read() {
    repo = ctx.getBean(StudentSubjectsRepository.class);
    }
    @Test
    public void update() {
    repo = ctx.getBean(StudentSubjectsRepository.class);
    }
    @Test
    public void delete() {
    repo = ctx.getBean(StudentSubjectsRepository.class);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(ConnectionConfigTest.class);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
