/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1608.sokolov.plant.vegetables;

import uits.jv1608.sokolov.plant.Plant;

/**
 *
 * @author kreol
 */
public class Vegetable extends Plant{
    
    public Vegetable(){
        super();
        }

    public Vegetable(double weight, int condition, int rippness, boolean peeled) {
        super(weight, condition, rippness, peeled);
    }
    
    @Override
    public void peel() {
//        super.setWeight(super.getWeight()* 0.95);
        weight *= 0.95;
        
    }
    
}
