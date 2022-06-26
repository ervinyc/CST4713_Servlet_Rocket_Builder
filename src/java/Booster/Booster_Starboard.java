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
public class Booster_Starboard extends Booster{

    public Booster_Starboard(double weight, RocketEngine engine) {
        super();
        this.model="STARBOARD";
        this.weight = weight;
        this.engine = engine;
    }

    public Booster_Starboard(String model, double weight, RocketEngine engine) {
        super(model, weight, engine);
    }
    
    
    
}
