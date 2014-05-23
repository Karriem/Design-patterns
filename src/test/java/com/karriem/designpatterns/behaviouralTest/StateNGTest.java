/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behaviouralTest;

import com.karriem.designpatterns.behavioural.state.HappyState;
import com.karriem.designpatterns.behavioural.state.Person;
import com.karriem.designpatterns.behavioural.state.SadState;
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
public class StateNGTest {
    
    public StateNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void state() {
     
         Person person = new Person(new HappyState());
         
         Assert.assertEquals("Hello, friend!", person.sayHello());
         Assert.assertEquals("Bye, friend!", person.sayGoodbye());
         
         person.setEmotionalState(new SadState());
         Assert.assertEquals("Hello. Sniff, sniff", person.sayHello());
         Assert.assertEquals("Bye. Sniff, sniff", person.sayGoodbye());
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
