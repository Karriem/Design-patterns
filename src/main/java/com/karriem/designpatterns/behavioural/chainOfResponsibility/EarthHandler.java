/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.karriem.designpatterns.behavioural.chainOfResponsibility;

/**
 *
 * @author Karriem
 */
public class EarthHandler extends PlanetHandler{

    @Override
    public String handleRequest(PlanetEnum request) {
        
        if (request == PlanetEnum.EARTH){
            
            System.out.println("EarthHandler handles " + request);
            System.out.println("Earth is comfortable");
            return "Earth";
        }
        else{
         
            System.out.println("EarthHandler does not handle " + request);
            if (successor != null)
                return successor.handleRequest(request);
            
            
        }   
        return null;
    }
    
}
