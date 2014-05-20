/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.creationalTest;

import com.karriem.designpatterns.creational.prototype.Dog;
import com.karriem.designpatterns.creational.prototype.Person;
import org.testng.Assert;
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
public class PrototypeNGTest {
    
    public PrototypeNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void prototype() {
     
         Person p1 = new Person("Fred");
         Person p2 = (Person) p1.doClone();
         Assert.assertEquals(p1.toString(), p2.toString());
         
         Dog d1 = new Dog("Woof");
         Dog d2 = (Dog) d1.doClone();
         Assert.assertEquals(d1.toString(), d2.toString());
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
}
