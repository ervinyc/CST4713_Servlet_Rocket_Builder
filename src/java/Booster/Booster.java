/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Booster;

import Engine.*;

/**
 *
 * @author ervin
 */
public abstract class Booster {
    protected String model;
    protected double weight;
    protected RocketEngine engine;

    public Booster(String model, double weight, RocketEngine engine) {
        this.model = model;
        this.weight = weight;
        this.engine = engine;
    }

    public Booster() {
    }
    
    

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public RocketEngine getEngine() {
        return engine;
    }

    public void setEngine(RocketEngine engine) {
        this.engine = engine;
    }
    
    
    
}
