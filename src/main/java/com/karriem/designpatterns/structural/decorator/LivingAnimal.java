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
public class LivingAnimal implements Animal{

    @Override
    public void describe() {
        
        System.out.println("\nI am an animal");
    }
    
}
