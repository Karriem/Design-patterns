/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.creationalTest;

import com.karriem.designpatterns.creational.factoryMethod.Animal;
import com.karriem.designpatterns.creational.factoryMethod.AnimalFactory;
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
public class FactoryMethodNGTest {
    
    public FactoryMethodNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
     
         AnimalFactory animalFactory = new AnimalFactory();
         
         Animal a1 = animalFactory.getAnimal("cannine");
         Assert.assertEquals("Woof", a1.makeSound());
         
         Animal a2 = animalFactory.getAnimal("feline");
         Assert.assertEquals("Meow", a2.makeSound());
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
