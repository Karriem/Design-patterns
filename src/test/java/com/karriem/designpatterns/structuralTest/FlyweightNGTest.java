/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.designpatterns.structuralTest;

import com.karriem.designpatterns.structural.flyweight.Flyweight;
import com.karriem.designpatterns.structural.flyweight.FlyweightFactory;
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
public class FlyweightNGTest {

    public FlyweightNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void flyweight() {

        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();

        Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
        Assert.assertEquals(flyweightAdder.doMath(5, 5), 10);

        Flyweight flyweightMutliplier = flyweightFactory.getFlyweight("mutiply");
        Assert.assertEquals(flyweightMutliplier.doMath(5, 5), 25);

        
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
