/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.creationalTest;

import com.karriem.designpatterns.creational.singleton.Singleton;
import junit.framework.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Karriem
 */
public class SingletonNGTest {
    
    public SingletonNGTest() {
    }

    @Test
    public void singletontest(){
        
        Singleton instance = Singleton.getInstance();
        
        Assert.assertEquals("Hello", instance.sayHello());
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
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

    /**
     * Test of getInstance method, of class Singleton.
     */
//    @Test
//    public void testGetInstance() {
//        System.out.println("getInstance");
//        Singleton expResult = null;
//        Singleton result = Singleton.getInstance();
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of sayHello method, of class Singleton.
//     */
//    @Test
//    public void testSayHello() {
//        System.out.println("sayHello");
//        Singleton instance = new Singleton();
//        instance.sayHello();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
