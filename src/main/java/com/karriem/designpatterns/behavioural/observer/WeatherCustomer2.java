/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karriem.designpatterns.behavioural.observer;

/**
 *
 * @author Karriem
 */
public class WeatherCustomer2 implements WeatherObserver {

    @Override
    public int doUpdate(int temperature) {

        System.out.println("Weather customer 2 just found out the temperature is: " + temperature);
        return temperature;
    }

}
