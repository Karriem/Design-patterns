/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behaviouralTest;

import com.karriem.designpatterns.behavioural.observer.WeatherCustomer1;
import com.karriem.designpatterns.behavioural.observer.WeatherCustomer2;
import com.karriem.designpatterns.behavioural.observer.WeatherStation;
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
public class ObserverNGTest {
    
    public ObserverNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void observer() {
        
        WeatherStation weatherStation = new WeatherStation(33);
        
        WeatherCustomer1 wC1 = new WeatherCustomer1();
        WeatherCustomer2 wC2 = new WeatherCustomer2();
        weatherStation.addObserver(wC1);
        weatherStation.addObserver(wC2);
        
        weatherStation.setTemperature(34);
        Assert.assertEquals(wC1.doUpdate(34), 34);
        Assert.assertEquals(wC2.doUpdate(34), 34);
        weatherStation.removeObserver(wC1);
        weatherStation.setTemperature(35);
        Assert.assertEquals(wC2.doUpdate(35), 35);
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
