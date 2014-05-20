/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.designpatterns.creationalTest;

import com.karriem.designpatterns.creational.builder.ItalianMealBuilder;
import com.karriem.designpatterns.creational.builder.JapaneseMealBuilder;
import com.karriem.designpatterns.creational.builder.Meal;
import com.karriem.designpatterns.creational.builder.MealBuilder;
import com.karriem.designpatterns.creational.builder.MealDirector;
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
public class BuilderNGTest {

    public BuilderNGTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void builder() {

        MealBuilder mealBuidler = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuidler);
        mealDirector.constructMeal();
        Meal meal = mealDirector.getMeal();
        Assert.assertEquals("Red Wine", meal.getDrink());
        Assert.assertEquals("Pizza", meal.getMainCourse());
        Assert.assertEquals("Bread", meal.getSide());
        
        MealBuilder mealBuidler2 = new JapaneseMealBuilder();
        MealDirector mealDirector2 = new MealDirector(mealBuidler2);
        mealDirector2.constructMeal();
        Meal meal2 = mealDirector2.getMeal();
        Assert.assertEquals("Sake", meal2.getDrink());
        Assert.assertEquals("Chicken Teriyaki", meal2.getMainCourse());
        Assert.assertEquals("Miso Soup", meal2.getSide());
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
