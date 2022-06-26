/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Booster;

import Engine.RocketEngine;

/**
 *
 * @author ervin
 */
public class Booster_Center extends Booster{

    
    public Booster_Center(double weight, RocketEngine engine) {
        super();
        this.model="CENTER";
        this.weight = weight;
        this.engine = engine;
    }

    public Booster_Center(String model, double weight, RocketEngine engine) {
        super(model, weight, engine);
    }
    
    
    
    
    
   
    
    
    
}
