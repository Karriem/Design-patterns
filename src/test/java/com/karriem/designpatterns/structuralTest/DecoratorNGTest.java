/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.structuralTest;

import com.karriem.designpatterns.structural.decorator.Animal;
import com.karriem.designpatterns.structural.decorator.GrowlDecorator;
import com.karriem.designpatterns.structural.decorator.LegDecorator;
import com.karriem.designpatterns.structural.decorator.LivingAnimal;
import com.karriem.designpatterns.structural.decorator.WingDecorator;
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
public class DecoratorNGTest {
    
    public DecoratorNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void decorator() {
     
         Animal animal = new LivingAnimal();
         animal.describe();
         
         animal = new LegDecorator(animal);
         animal.describe();
         
         animal = new WingDecorator(animal);
         animal.describe();
         
         animal = new GrowlDecorator(animal);
         animal = new GrowlDecorator(animal);
         animal.describe();
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
