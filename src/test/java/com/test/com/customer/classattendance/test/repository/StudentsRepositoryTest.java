/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.com.customer.classattendance.test.repository;

import com.customer.classattendance.domain.Students;
import com.customer.classattendance.repository.StudentsRepository;
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
public class StudentsRepositoryTest {
     public static ApplicationContext ctx;
     private StudentsRepository repo;
     private Students stud;
     private String   studNumber;
     
     
    public StudentsRepositoryTest() {
    }

    @Test
    public void create() {
    repo = ctx.getBean(StudentsRepository.class);
    stud = new Students.Builder()
                       .studendNumber("2143685")
                       .name("Apple")
                       .surname("Mac")
                       .build();
    repo.save(stud);
    Assert.assertNotNull(stud);
    
    }
    @Test
    public void read() {
    repo = ctx.getBean(StudentsRepository.class);
    }
    @Test
    public void update() {
    repo = ctx.getBean(StudentsRepository.class);
    }
    @Test
    public void delete() {
    repo = ctx.getBean(StudentsRepository.class);
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
