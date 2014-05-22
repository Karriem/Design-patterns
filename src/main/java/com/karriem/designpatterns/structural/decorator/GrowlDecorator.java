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
public class GrowlDecorator extends AnimalDecorator{

    public GrowlDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        
        animal.describe();
        growl();
    }
    
    public void growl(){
        
        System.out.println("Grrrrrrrr.");
    }
}
