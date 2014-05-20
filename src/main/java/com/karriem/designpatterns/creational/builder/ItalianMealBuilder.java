/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.creational.builder;

/**
 *
 * @author Karriem
 */
public class ItalianMealBuilder implements MealBuilder{

    private Meal meal;

    public ItalianMealBuilder() {
        meal = new Meal();
    }   
    
    @Override
    public void buildDrink() {
        
        meal.setDrink("Red Wine");
    }

    @Override
    public void buildMainCourse() {
        
        meal.setMainCourse("Pizza");
    }

    @Override
    public void buildSide() {
        
        meal.setSide("Bread");
    }

    @Override
    public Meal getMeal() {
        
        return meal;
    }
    
}
