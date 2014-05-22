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
public class MercuryHandler extends PlanetHandler{

    @Override
    public String handleRequest(PlanetEnum request) {
        
        if (request == PlanetEnum.MERCURY){
            
            System.out.println("MercuryHandler handles " + request);
            System.out.println("Mercury is hot");
            return "Mercury";
        }
        else{
         
            System.out.println("MercuryHandler does not handle " + request);
            if (successor != null)
                return successor.handleRequest(request);
            
            
        }    
        return null;
    }
        
}
