/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behavioural.strategy;

/**
 *
 * @author Karriem
 */
public class SkitStrategy implements Strategy{

    @Override
    public boolean checkTemperature(int temperatureInF) {
       
        if (temperatureInF <= 32){
            return true;
        }
        else {
            return false;
        }
    }
    
}
