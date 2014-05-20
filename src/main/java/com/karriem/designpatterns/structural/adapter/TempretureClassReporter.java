/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.structural.adapter;

/**
 *
 * @author Karriem
 */
public class TempretureClassReporter extends CelciusReporter implements TempretureInfo{
    
    @Override
    public double getTempretureInF() {
        
        return cToF(tempretureInC);
    }

    @Override
    public double getTempretureInC() {
        
        return tempretureInC;
    }
    
    @Override
    public void setTempretureInF(double tempretureInF) {
        
        this.tempretureInC = fToC(tempretureInF);
    }    

    @Override
    public void setTempretureInC(double tempretureInc) {
        
        this.tempretureInC = tempretureInc;
    }
    
    private double fToC(double f){
        
        return ((f - 32) * 5 / 9);
    }    
    
    private double cToF(double c){
        
        return ((c * 5 / 9) + 32);
    }
}
