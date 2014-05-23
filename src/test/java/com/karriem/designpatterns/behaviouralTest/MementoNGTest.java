/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behaviouralTest;

import com.karriem.designpatterns.behavioural.memento.DietInfo;
import com.karriem.designpatterns.behavioural.memento.DietInfoCaretaker;
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
public class MementoNGTest {
    
    public MementoNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void memento() {
     
         DietInfoCaretaker dietInfoCaretaker = new DietInfoCaretaker();
         
         DietInfo dietInfo = new DietInfo("Fred", 1, 100);
         System.out.println(dietInfo);
         
         dietInfo.setDayNumberAndWeight(2, 99);
         System.out.println(dietInfo);
         Assert.assertEquals("Name Fred, day number 2, weight 99", dietInfo.toString());
         System.out.println("Saving state");
         dietInfoCaretaker.saveState(dietInfo);
         
         dietInfo.setDayNumberAndWeight(3, 98);
         System.out.println(dietInfo);
         
         dietInfo.setDayNumberAndWeight(4, 97);
         System.out.println(dietInfo);
         
         System.out.println("Restoring saved state");
         dietInfoCaretaker.restoreState(dietInfo);
         System.out.println(dietInfo);
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
