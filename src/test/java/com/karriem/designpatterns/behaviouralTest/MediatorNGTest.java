/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behaviouralTest;

import com.karriem.designpatterns.behavioural.mediator.AmericanSeller;
import com.karriem.designpatterns.behavioural.mediator.Buyer;
import com.karriem.designpatterns.behavioural.mediator.DollarConverter;
import com.karriem.designpatterns.behavioural.mediator.FrenchBuyer;
import com.karriem.designpatterns.behavioural.mediator.Mediator;
import com.karriem.designpatterns.behavioural.mediator.SwedishBuyer;
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
public class MediatorNGTest {
    
    public MediatorNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void mediator() {
     
         Mediator mediator = new Mediator();
         
         Buyer swedishBuyer = new SwedishBuyer(mediator);
         Buyer frenchBuyer = new FrenchBuyer(mediator);
         
         float sellingPriceDollars = 10.0f;
         
         AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceDollars);
         DollarConverter dollarConverter = new DollarConverter(mediator);
         
//         float swedishBidInKronor = 55.0f;
//         while (!swedishBuyer.attemptToPurchase(swedishBidInKronor)){
//             
//             swedishBidInKronor += 15.0f;
//         }
//         
//         float frenchBidInEuros = 3.0f;
//         while (!frenchBuyer.attemptToPurchase(frenchBidInEuros)){
//             
//             frenchBidInEuros += 1.5f;
//         }
         
         float loosingBidKronas = 55.0f;
         float loosingBidEuros = 3.0f;
         float winningBidKrons = 555.0f;
         float winningBidEuros = 33.0f;
         
         Assert.assertFalse(swedishBuyer.attemptToPurchase(loosingBidKronas));
         Assert.assertFalse(frenchBuyer.attemptToPurchase(loosingBidEuros));
         Assert.assertTrue(swedishBuyer.attemptToPurchase(winningBidKrons));
         Assert.assertTrue(frenchBuyer.attemptToPurchase(winningBidEuros));
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
