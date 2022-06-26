/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Engine;

import Enums.RocketFuel;

/**
 *
 * @author ervin
 */
public abstract class RocketEngine {
    protected String model;
    protected RocketFuel fuel;
    protected double weight;

    public RocketEngine(String model, RocketFuel fuel, double weight) {
        this.model = model;
        this.fuel = fuel;
        this.weight = weight;
    }

    public RocketEngine() {
    }

    
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public RocketFuel getFuel() {
        return fuel;
    }

    public void setFuel(RocketFuel fuel) {
        this.fuel = fuel;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
}
