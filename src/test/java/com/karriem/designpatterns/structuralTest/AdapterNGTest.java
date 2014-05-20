/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.structuralTest;

import com.karriem.designpatterns.structural.adapter.TempretureClassReporter;
import com.karriem.designpatterns.structural.adapter.TempretureInfo;
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
public class AdapterNGTest {
    
    public AdapterNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void adapter() {
     
         TempretureInfo tempInfo = new TempretureClassReporter();
         tempInfo.setTempretureInC(0);
         Assert.assertEquals(0, Math.round(tempInfo.getTempretureInC()));
         
         tempInfo = new TempretureClassReporter();
         tempInfo.setTempretureInF(85);
         Assert.assertEquals(29, Math.round(tempInfo.getTempretureInC()));
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
