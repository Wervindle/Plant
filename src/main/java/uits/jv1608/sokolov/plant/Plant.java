/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1608.sokolov.plant;

/**
 *
 * @author kreol
 */
public abstract class Plant implements Peelable{
    protected double weight;
    protected int condition; //0:100
    protected int rippness; //0:100
    protected boolean peeled;

    public Plant() {
    }

    public Plant(double weight, int condition, int rippness, boolean peeled) {
        this.weight = weight;
        this.condition = condition;
        this.rippness = rippness;
        this.peeled = peeled;
    }

    public boolean isPeeled() {
        return peeled;
    }

    public void setPeeled(boolean peeled) {
        this.peeled = peeled;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        if(condition <0 || condition >100){
            throw new IllegalArgumentException(
                    "condidtion cannot be less then 0 or more then 100");
        }
        this.condition = condition;
    }

    public int getRippness() {
        return rippness;
    }

    public void setRippness(int rippness) {
        if(rippness <0 || rippness >100){
            throw new IllegalArgumentException(
                    "rippness cannot be less then 0 or more then 100");
        }
        this.rippness = rippness;
    }
    
    
    
}
