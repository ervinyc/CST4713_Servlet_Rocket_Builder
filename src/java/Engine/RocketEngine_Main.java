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
public class RocketEngine_Main extends RocketEngine{

    public RocketEngine_Main(double weight) {
        super();
        this.model = "MAIN";
        this.fuel = RocketFuel.AlphaFuel;
        this.weight = weight;
    }

    public RocketEngine_Main(String model, RocketFuel fuel, double weight) {
        super(model, fuel, weight);
    }
    
    
    
}
