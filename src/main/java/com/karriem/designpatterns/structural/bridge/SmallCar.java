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
public class SmallCar extends Vehicle{

    public SmallCar(Engine engine){
        
        this.weightInKiloa = 600;
        this.engine = engine;                
    }
    
    @Override
    public void drive() {
        System.out.println("The small car is driving");
        int horsepower = engine.go();
        reportOnSpeed(horsepower);
    }
    
}
