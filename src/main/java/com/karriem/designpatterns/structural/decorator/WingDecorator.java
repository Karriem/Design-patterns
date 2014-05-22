/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.structural.decorator;

/**
 *
 * @author Karriem
 */
public class WingDecorator extends AnimalDecorator{

    public WingDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        
        animal.describe();
        System.out.println("I have wings");
        fly();
    }
    
    public void fly(){
        
        System.out.println("I can fly");
    }
}
