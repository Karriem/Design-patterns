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
public abstract class Vehicle {
    
    Engine engine;
    int weightInKiloa;
    
    public abstract void drive();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    public void reportOnSpeed(int horsePower){
        
        int ratio = weightInKiloa / horsePower;
        
        if (ratio < 3){
            System.out.println("The vehicle is going at a fast speed.");
        }
        else if (ratio >= 3){
             System.out.println("The vehicle is going at a average speed.");           
        }
        else{
            System.out.println("The vehicle is going at a slow speed.");
        }
    }
}
