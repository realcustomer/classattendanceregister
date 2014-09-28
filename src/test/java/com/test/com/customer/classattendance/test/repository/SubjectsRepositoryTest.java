/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.com.customer.classattendance.test.repository;

import com.customer.classattendance.domain.Course;
import com.customer.classattendance.domain.Department;
import com.customer.classattendance.domain.Faculty;
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
     
     private Course c;
     private Department dp;
     private Faculty fac;
    public SubjectsRepositoryTest() {
    }
    public void first()
    {
        fac = new Faculty.Builder()
                .name("Informatics")
                .build();

        dp = new Department.Builder()
                    .name("iNFO")
                    .faculty(fac)
                    .contactDetails("911")
                    .build();
        c    = new Course.Builder()
                         .name("IT")
                         .department(dp)
                         .type("BA")
                         .build();
    }
    @Test
    public void createSubjects() {
        first();
        repo = ctx.getBean(SubjectsRepository.class);
        sub = new Subjects.Builder()
                          .subjectId("DOS100")
                          .name("DevelopmentSoftware")
                          .course(c)
                          .build();
        repo.save(sub);
        Assert.assertNotNull(sub);
    
    }
    //@Test
    public void readSubjects() {
    repo = ctx.getBean(SubjectsRepository.class);
    }
    //@Test
    public void updateSubjects() {
    repo = ctx.getBean(SubjectsRepository.class);
    }
    //@Test
    public void deleteSubjects() {
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
