/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1608.sokolov.plant.vegetables;

import java.util.concurrent.locks.Condition;

/**
 *
 * @author kreol
 */
public class Potato extends Vegetable{

    public Potato() {
    }

    public Potato(double weight, int condition, int rippness, boolean peeled) {
        super(weight, condition, rippness, peeled);
    }

    @Override
    public String toString() {
        return "Potato{" + 
                " weight = " +weight+
                " condition = "+condition +
                " rippness = "+rippness+
                " peeled = " + peeled +'}';
    }
    
    
}
