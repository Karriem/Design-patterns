/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.creational.abstractFactoryMethod;

/**
 *
 * @author Karriem
 */
class Snake extends Animal {

    public Snake() {
    }

    @Override
    public String makeSound() {
        
        return "Hiss";
    }
    
}