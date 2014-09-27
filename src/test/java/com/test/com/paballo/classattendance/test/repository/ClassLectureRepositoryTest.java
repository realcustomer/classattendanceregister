/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.com.paballo.classattendance.test.repository;

import com.customer.classattendance.domain.ClassLecture;
import com.customer.classattendance.repository.ClassLectureRepository;
import com.test.com.paballo.classattendance.test.ConnectionConfigTest;
import java.util.*;
//import org.apache.derby.client.am.DateTime;
import java.util.Calendar;
import org.joda.time.DateTime;
//import org.apache.derby.client.am.DateTime;
//import org.joda.time.DateTime;
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
public class ClassLectureRepositoryTest {
     public static ApplicationContext ctx;
     private Long id;
     private DateTime dts;
     private ClassLectureRepository repo;
    
    public ClassLectureRepositoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test(enabled = true)
    public void create()
    {
        repo = ctx.getBean(ClassLectureRepository.class);
        ClassLecture cl = new ClassLecture.Builder()
                                           .startTime(DateTime.now())
                                           .endTime(DateTime.now())
                                           .build();
                                          
        id = cl.getId();
        Assert.assertNotNull(cl);
                                       
    }
    
    @Test(dependsOnMethods = "createPerson", enabled =true)
    public void read(){
        repo = ctx.getBean(ClassLectureRepository.class);
        ClassLecture cl = repo.findOne(id);
        Assert.assertEquals(cl.getStartTime(), DateTime.now());
    
    }
    @Test
    public void update()
    {
        repo = ctx.getBean(ClassLectureRepository.class);
        
        ClassLecture cl      = repo.findOne(id);
        ClassLecture updated = new ClassLecture.Builder()
                                          .startTime(null)
                                          .endTime(null)
                                          .build();
        repo.save(updated);
        
    }
    @Test
    public void delete()
    {
        repo = ctx.getBean(ClassLectureRepository.class);
        ClassLecture cl = repo.findOne(id);
        
       repo.delete(cl);
       
       ClassLecture deleted = repo.findOne(id);
       Assert.assertNull(deleted);
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
