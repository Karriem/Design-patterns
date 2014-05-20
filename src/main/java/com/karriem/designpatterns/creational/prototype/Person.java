/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.creational.prototype;

/**
 *
 * @author Karriem
 */
public class Person implements Prototype{

    String name;

    public Person(String name) {
        this.name = name;
    }
    
    @Override
    public Prototype doClone() {
        
        return new Person(name);
    }

    @Override
    public String toString() {
        return "Person{" + "This person named " + name + '}';
    }
    
}
