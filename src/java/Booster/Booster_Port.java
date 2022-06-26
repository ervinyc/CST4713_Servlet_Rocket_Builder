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
public class Booster_Port extends Booster{

    public Booster_Port(double weight, RocketEngine engine) {
        super();
        this.model="PORT";
        this.weight = weight;
        this.engine = engine;
    }

    public Booster_Port(String model, double weight, RocketEngine engine) {
        super(model, weight, engine);
    }
    
    
    
}
