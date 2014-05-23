/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behaviouralTest;

import com.karriem.designpatterns.behavioural.command.Command;
import com.karriem.designpatterns.behavioural.command.Dinner;
import com.karriem.designpatterns.behavioural.command.DinnerCommand;
import com.karriem.designpatterns.behavioural.command.Lunch;
import com.karriem.designpatterns.behavioural.command.LunchCommand;
import com.karriem.designpatterns.behavioural.command.MealInvoker;
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
public class CommandNGTest {
    
    public CommandNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void command() {
     
         Lunch lunch = new Lunch();
         Command lunchCommand = new LunchCommand(lunch);
         
         Dinner dinner = new Dinner();
         Command dinnerCommand = new DinnerCommand(dinner);
         
         MealInvoker mealInvoker = new MealInvoker(lunchCommand);
         Assert.assertEquals("Lunch is being made", mealInvoker.invoke());
         
         mealInvoker.setCommand(dinnerCommand);
         Assert.assertEquals("Dinner is being made", mealInvoker.invoke());
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
