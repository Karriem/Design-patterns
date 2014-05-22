/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behavioural.template;

/**
 *
 * @author Karriem
 */
public class CheeseBurger extends Meal{

    @Override
    public String prepareIngredients() {
        
        return "Getting ground beef and Cheese";
    }

    @Override
    public String cook() {
        
        return "Cooking ground beef in pan";
    }

    @Override
    public String  eat(){
        
       return "The cheese burgers are tasty"; 
    }
    
    @Override
    public String  cleanUp() {
        
        return "Doing the dishes";
    }
    
}
