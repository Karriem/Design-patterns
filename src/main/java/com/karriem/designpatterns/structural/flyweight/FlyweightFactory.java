/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Karriem
 */
public class FlyweightFactory {
    
    private static FlyweightFactory flyweightFactory;
    private Map<String, Flyweight> flyweightpool;

    public FlyweightFactory() {
        
        flyweightpool = new HashMap<>();
    }
    
    public static FlyweightFactory getInstance(){
        
        if (flyweightFactory == null){
            
            flyweightFactory = new FlyweightFactory();
        }        
        return flyweightFactory;
    }
    
    public Flyweight getFlyweight(String key){
        
        if (flyweightpool.containsKey(key)){
            
            return flyweightpool.get(key);
        }
        else{
            
            Flyweight flyweight;
            
            if ("add".equals(key)){
                
                flyweight = new FlyweightAdder();
            }
            else{
                
                flyweight = new FlyweightMultiplier();
            }
            
            flyweightpool.put(key, flyweight);            
            return flyweight;
        }
    }
}
