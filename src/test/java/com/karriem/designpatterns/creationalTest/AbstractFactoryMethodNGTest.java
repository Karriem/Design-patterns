/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.creationalTest;

import com.karriem.designpatterns.creational.abstractFactoryMethod.AbstractFactory;
import com.karriem.designpatterns.creational.abstractFactoryMethod.Animal;
import com.karriem.designpatterns.creational.abstractFactoryMethod.SpeciesFactory;
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
public class AbstractFactoryMethodNGTest {
    
    public AbstractFactoryMethodNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void getSpeciesSound() {
     
         AbstractFactory abstractFactory = new AbstractFactory();
         
         SpeciesFactory s1 = abstractFactory.getSpeciesFactory("mammal");
         Animal a1 = s1.getAnimal("Dog");
         Assert.assertEquals("Woof", a1.makeSound());
         
         Animal a2 = s1.getAnimal("Cat");
         Assert.assertEquals("Meow", a2.makeSound());
         
         SpeciesFactory s2 = abstractFactory.getSpeciesFactory("reptile");
         Animal a3 = s2.getAnimal("snake");
         Assert.assertEquals("Hiss", a3.makeSound());
         
         Animal a4 = s2.getAnimal("tyrannosauros");
         Assert.assertEquals("Roar", a4.makeSound());
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
