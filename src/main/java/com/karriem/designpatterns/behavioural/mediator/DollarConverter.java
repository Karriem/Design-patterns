/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behavioural.mediator;

/**
 *
 * @author Karriem
 */
public class DollarConverter {
    
    Mediator mediator;
    public static final float DOLLAR_UNIT = 1.0f;
    public static final float EURO_UNIT = 0.7f;
    public static final float KRONA_UNIT = 8.0f;

    public DollarConverter(Mediator mediator) {
        this.mediator = mediator;
        mediator.registerDollarConverter(this);
    }    
    
    private float convertEurosToDollars(float euros){
        
        float dollars = euros * (DOLLAR_UNIT / EURO_UNIT);
        System.out.println("Converting " + euros + " euros to " + dollars + " dolalrs");
        return dollars;
    }
    
    private float convertKronasToDollars(float kronor){
        
        float dollars = kronor * (DOLLAR_UNIT / KRONA_UNIT);
        System.out.println("Converting " + kronor + " kronor to " + dollars + " dolalrs");
        return dollars;
    }
    
    public float convertCurrencyToDollars(float amount, String unitOfCurrentcy){
        
        if ("krona".equalsIgnoreCase(unitOfCurrentcy)){
            return convertKronasToDollars(amount);
        }
        else {
            return convertEurosToDollars(amount);
        }
    }
}
