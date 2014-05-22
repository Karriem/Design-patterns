/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.designpatterns.behaviouralTest;

import com.karriem.designpatterns.behavioural.chainOfResponsibility.EarthHandler;
import com.karriem.designpatterns.behavioural.chainOfResponsibility.MercuryHandler;
import com.karriem.designpatterns.behavioural.chainOfResponsibility.PlanetEnum;
import com.karriem.designpatterns.behavioural.chainOfResponsibility.PlanetHandler;
import com.karriem.designpatterns.behavioural.chainOfResponsibility.VenusHandler;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.security.jgss.spi.MechanismFactory;

/**
 *
 * @author Karriem
 */
public class ChainOfResponsibilityNGTest {

    public ChainOfResponsibilityNGTest() {
    }

    public static PlanetHandler setUpChain() {

        PlanetHandler mercuryHandler = new MercuryHandler();
        PlanetHandler venusHandler = new VenusHandler();
        PlanetHandler earthHandler = new EarthHandler();

        mercuryHandler.setSuccessor(venusHandler);
        venusHandler.setSuccessor(earthHandler);

        return mercuryHandler;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void chainOfResponsibility() {

        PlanetHandler chain = setUpChain();
        
        Assert.assertEquals(chain.handleRequest(PlanetEnum.MERCURY), "Mercury");
        Assert.assertEquals(chain.handleRequest(PlanetEnum.VENUS), "Venus");
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
