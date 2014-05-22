/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.structural.bridge;

/**
 *
 * @author Karriem
 */
public class BigBus extends Vehicle{

    public BigBus(Engine engine){
        
        this.weightInKiloa = 3000;
        this.engine = engine;
    }
    
    @Override
    public void drive() {
        
        System.out.println("\nThe big bus is driving");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
    
}
