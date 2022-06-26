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
public class RocketEngine_Booster extends RocketEngine{

    public RocketEngine_Booster(double weight) {
        super();
        this.model = "BOOSTER";
        this.fuel = RocketFuel.GammaFuel;
        this.weight = weight;
    }

    public RocketEngine_Booster(String model, RocketFuel fuel, double weight) {
        super(model, fuel, weight);
    }
    
    
}
