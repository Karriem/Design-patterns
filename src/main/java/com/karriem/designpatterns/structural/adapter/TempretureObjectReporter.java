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
public class TempretureObjectReporter implements TempretureInfo{

    CelciusReporter celciusReporter;

    public TempretureObjectReporter() {
        celciusReporter = new CelciusReporter();
    }
       
    @Override
    public double getTempretureInF() {
        
        return cToF(celciusReporter.tempretureInC);
    }

    @Override
    public void setTempretureInF(double tempretureInf) {
        
        celciusReporter.setTempretureInC(fToC(tempretureInf));
    }

    @Override
    public double getTempretureInC() {
        
        return celciusReporter.getTempretureInC();
    }

    @Override
    public void setTempretureInC(double tempretureInc) {
        
        celciusReporter.setTempretureInC(tempretureInc);
    }
    
     private double fToC(double f){
        
        return ((f - 32) * 5 / 9);
    }    
    
    private double cToF(double c){
        
        return ((c * 5 / 9) + 32);
    }
}
