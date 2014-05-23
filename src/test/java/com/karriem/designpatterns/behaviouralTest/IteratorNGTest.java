/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behaviouralTest;

import com.karriem.designpatterns.behavioural.iterator.Item;
import com.karriem.designpatterns.behavioural.iterator.Menu;
import java.util.Iterator;
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
public class IteratorNGTest {
    
    public IteratorNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void iterator() {
         
         Item item1 = new Item("spaghetti", 7.50f);
         Item item2 = new Item("hamburger", 6.00f);
         Item item3 = new Item("chicken sandwich", 6.50f);
         
         Menu menu = new Menu();
         menu.addItem(item1);
         menu.addItem(item2);
         menu.addItem(item3);
         
         System.out.println("Displaying Menu");
         Iterator<Item> iterator = menu.iterator();
         Item i = iterator.next();
         Assert.assertEquals(i.toString(), "spaghetti: $7.5");
         while (iterator.hasNext()){
             
             Item item = iterator.next();
             System.out.println(item);
         }
         
         System.out.println("\nRemoving last item returned");
         iterator.remove();
         
         System.out.println("Displaying Menu");
         iterator = menu.iterator();
         
         while(iterator.hasNext()){
             
             Item item = iterator.next();
             System.out.println(item);
         }
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
