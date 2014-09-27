/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.com.customer.classattendance.test.repository;

import com.customer.classattendance.domain.Subjects;
import com.customer.classattendance.repository.SubjectsRepository;
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
public class SubjectsRepositoryTest {
     public static ApplicationContext ctx;
     private SubjectsRepository repo;
     private Subjects sub;
     private String   subjectCode;
    
    public SubjectsRepositoryTest() {
    }

    @Test
    public void create() {
    repo = ctx.getBean(SubjectsRepository.class);
    sub = new Subjects.Builder()
                      .subjectId("DOS100")
                      .name("DevelopmentSoftware")
                      .co_ordinator("Piyose")
                      .build();
    repo.save(sub);
    Assert.assertNotNull(sub);
    
    }
    @Test
    public void read() {
    repo = ctx.getBean(SubjectsRepository.class);
    }
    @Test
    public void update() {
    repo = ctx.getBean(SubjectsRepository.class);
    }
    @Test
    public void delete() {
    repo = ctx.getBean(SubjectsRepository.class);
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
