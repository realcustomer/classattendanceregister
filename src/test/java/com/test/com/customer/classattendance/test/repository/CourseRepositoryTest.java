/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.com.customer.classattendance.test.repository;

import com.customer.classattendance.domain.Course;
import com.customer.classattendance.repository.CourseRepository;
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
public class CourseRepositoryTest {
     public static ApplicationContext ctx;
     private Long id;
     private CourseRepository repo;
     
     private Course c;
    
    public CourseRepositoryTest() {
    }


    @Test
    public void create() {
    repo = ctx.getBean(CourseRepository.class);
    
    Course c    = new Course.Builder()
                     .name("IT")
                     .term("2014")
                     .type("BA")
                     .build();
    repo.save(c);
    id = c.getId();
    Assert.assertNotNull(c);
    
    
    }
    @Test
    public void read() {
     repo = ctx.getBean(CourseRepository.class);   
    
    }
    @Test
    public void update() {
    repo = ctx.getBean(CourseRepository.class);
    }
    @Test
    public void delete() {
    repo = ctx.getBean(CourseRepository.class);
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
