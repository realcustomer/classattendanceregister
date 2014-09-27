/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.com.paballo.classattendance.test.repository;

import com.customer.classattendance.domain.Lecturer;
import com.customer.classattendance.repository.LecturerRepository;
import com.test.com.paballo.classattendance.test.ConnectionConfigTest;
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
public class LecturerRepositoryTest {
     public static ApplicationContext ctx;
     private LecturerRepository repo;
     private Long id;
     private Lecturer lc;
    
    public LecturerRepositoryTest() {
    }

    @Test
    public void create() {
    repo = ctx.getBean(LecturerRepository.class);
    lc = new Lecturer.Builder()
                     .name("Burger")
                     .office("2.39")
                     .telephone("10111")
                     .email("BURGER@myburgerKing.com")
                     .build();
    
    repo.save(lc);
    id = lc.getId();
    Assert.assertNotNull(lc);
    }
    @Test
    public void read() {
    repo = ctx.getBean(LecturerRepository.class);
    }
    @Test
    public void update() {
    repo = ctx.getBean(LecturerRepository.class);
    }
    @Test
    public void delete() {
    repo = ctx.getBean(LecturerRepository.class);
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
