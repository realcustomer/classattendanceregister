/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.com.customer.classattendance.test.repository;

import com.customer.classattendance.domain.Department;
import com.customer.classattendance.repository.DepartmentRepository;
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
public class DepartmentRepositoryTest {
     public static ApplicationContext ctx;
     private DepartmentRepository repo;
     private Long id;
     private Department dp;
     
    
    public DepartmentRepositoryTest() {
    }
@Test
    public void create() {
    repo = ctx.getBean(DepartmentRepository.class);
    
    dp = new Department.Builder()
                       .name("iNFO")
                       .contactDetails("911")
                       .build();
    repo.save(dp);
    id = dp.getId();
    Assert.assertNotNull(dp);
    
    }
    @Test
    public void read() {
    repo = ctx.getBean(DepartmentRepository.class);
    }
    @Test
    public void update() {
    repo = ctx.getBean(DepartmentRepository.class);
    }
    @Test
    public void delete() {
    repo = ctx.getBean(DepartmentRepository.class);
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
