/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behaviouralTest;

import com.karriem.designpatterns.behavioural.strategy.Context;
import com.karriem.designpatterns.behavioural.strategy.HikeStrategy;
import com.karriem.designpatterns.behavioural.strategy.SkitStrategy;
import com.karriem.designpatterns.behavioural.strategy.Strategy;
import org.junit.Assert;
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
public class StrategyNGTest {
    
    public StrategyNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void strategy() {
     
         int temperatureInF = 60;
         
         Strategy skitStrategy = new SkitStrategy();
         Context context = new Context(temperatureInF, skitStrategy);
         System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for skiing? ");
         Assert.assertFalse(context.getResult());
         
         Strategy hikeStrategy = new HikeStrategy();  
         context.setStrategy(hikeStrategy);
         System.out.println("Is the temperature (" + context.getTemperatureInF() + "F) good for hiking? ");
         Assert.assertTrue(context.getResult());
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
