/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.structural.proxy;

import java.util.Date;

/**
 *
 * @author Karriem
 */
public abstract class Thing {
    
    public void sayHello(){
        
        System.out.println(this.getClass().getSimpleName() + " says howdy at " + new Date());
        
    }
}
