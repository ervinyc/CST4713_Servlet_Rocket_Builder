/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rocket;

import Booster.*;

/**
 *
 * @author ervin
 */
public class SpaceRocket {
    private String model;
    private Capsule payload;
    private Booster[] boosters;
    private double weight;

    public SpaceRocket(String model, Capsule payload, Booster[] boosters) {
        this.model = model;
        this.payload = payload;
        this.boosters = boosters;
    }
    
    public double getTotalWeight(){
        double capWei, engWei =0, bstWei=0, tWeight;
        capWei = payload.getWeight();
        for (int i=0; i<=boosters.length-1; i++){
            bstWei += boosters[i].getWeight();
            engWei += boosters[i].getEngine().getWeight();
        }
        tWeight = capWei + engWei + bstWei;
        return tWeight;
    }

    @Override
    public String toString(){
        double tWeight = getTotalWeight();
        String info = String.format("Model: %s <br>",model)
                +String.format("Capsule Model: %s <br>",payload.getModel())
                +String.format("Total Weight: %.2f <br>",tWeight);
        return info;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Capsule getPayload() {
        return payload;
    }

    public void setPayload(Capsule payload) {
        this.payload = payload;
    }

    public Booster[] getBoosters() {
        return boosters;
    }

    public void setBoosters(Booster[] boosters) {
        this.boosters = boosters;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
}
