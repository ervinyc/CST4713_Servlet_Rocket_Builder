/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rocket;

/**
 *
 * @author ervin
 */
public class Capsule {
    private String model;
    private double weight;

    public Capsule(String model, double weight) {
        this.model = model;
        this.weight = weight;
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
    
    
}
