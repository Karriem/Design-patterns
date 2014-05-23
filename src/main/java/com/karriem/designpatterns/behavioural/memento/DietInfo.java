/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behavioural.memento;

/**
 *
 * @author Karriem
 */
public class DietInfo {
    
    String personName;
    int dayNumber;
    int weight;

    public DietInfo(String personName, int dayNumber, int weight) {
        this.personName = personName;
        this.dayNumber = dayNumber;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  "Name " + personName + ", day number " + dayNumber + ", weight " + weight;
    }
    
    public void setDayNumberAndWeight(int dayNumber, int weight){
        
        this.dayNumber = dayNumber;
        this.weight = weight;
    }
    
    public Memento save(){
        return new Memento(personName, dayNumber, weight);
    }
    
    public void restore(Object objMomento){
        
        Memento memento = (Memento) objMomento;
        personName = memento.mementoPersonName;
        dayNumber = memento.mementoDayNumber;
        weight = memento.mementoWeight;
    }
    
    private class Memento{
        
        String mementoPersonName;
        int mementoDayNumber;
        int mementoWeight;

        public Memento(String personName, int dayNumber, int weight) {
            mementoPersonName = personName;
            mementoDayNumber = dayNumber;
            mementoWeight = weight;
        }        
    }
}
