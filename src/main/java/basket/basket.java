/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basket;

import uits.jv1608.sokolov.plant.Plant;

/**
 *
 * @author kreol
 */
public class basket <T extends Plant> {
    private Object[] plants;
    private int size = 0;
    

    public basket() {
        plants = (T[])new Object[10];    
    }
    
    public int size(){
        return this.size;
    }
    
    public void add(T val){
        if(size == plants.length){
            throw new IllegalStateException("корзина переполнена");
        }
        plants[size++] = val;
    }
    
    
    
}
