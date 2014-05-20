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
public interface TempretureInfo {
    
    public double getTempretureInF();
    
    public void setTempretureInF(double tempretureInf);
    
    public double getTempretureInC();
    
    public void setTempretureInC(double tempretureInc);
}
