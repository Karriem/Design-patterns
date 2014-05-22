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
public class VenusHandler extends PlanetHandler{

    @Override
    public String handleRequest(PlanetEnum request) {
        
        if (request == PlanetEnum.VENUS){
            
            System.out.println("VenusHandler handles " + request);
            System.out.println("Venus is poisonous");
            return "Venus";
        }
        else{
         
            System.out.println("VenusHandler does not handle " + request);
            if (successor != null)
                return successor.handleRequest(request);
            
            
        } 
        return null;
    }
}
