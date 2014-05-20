/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.creational.singleton;

/**
 *
 * @author Karriem
 */
public class Singleton {
    
    private static Singleton singleton = null;

    public Singleton() {
    }
    
    public static Singleton getInstance(){
        
        if (singleton == null){
            
            singleton = new Singleton();
        }
        return singleton;
    } 
    
    public String sayHello(){
        
        return "Hello";
    }
}
