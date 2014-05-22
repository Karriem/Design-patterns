/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.structuralTest;

import com.karriem.designpatterns.structural.bridge.BigBus;
import com.karriem.designpatterns.structural.bridge.BigEngine;
import com.karriem.designpatterns.structural.bridge.SmallCar;
import com.karriem.designpatterns.structural.bridge.SmallEngine;
import com.karriem.designpatterns.structural.bridge.Vehicle;
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
public class BridgeNGTest {
    
    public BridgeNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void bridge() {
     
         Vehicle vehicle = new BigBus(new SmallEngine());
         vehicle.drive();
         vehicle.setEngine(new BigEngine());
         vehicle.drive();
         
         vehicle = new SmallCar(new SmallEngine());
         vehicle.drive();
         vehicle.setEngine(new BigEngine());
         vehicle.drive();
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
