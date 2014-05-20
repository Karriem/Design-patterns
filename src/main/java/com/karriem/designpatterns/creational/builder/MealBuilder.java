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
public interface MealBuilder {
    
    public void buildDrink();
    
    public void buildMainCourse();
    
    public void buildSide(); 
    
    public Meal getMeal();
}