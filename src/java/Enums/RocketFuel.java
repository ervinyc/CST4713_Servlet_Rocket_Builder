/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author ervin
 */
public enum RocketFuel {
    
    AlphaFuel("Alpha Fuel",10000),
    GammaFuel("Gamma Fuel",12000);
    
    private String name;
    private int thrust;

    private RocketFuel(String name, int thrust) {
        this.name = name;
        this.thrust = thrust;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThrust() {
        return thrust;
    }

    public void setThrust(int thrust) {
        this.thrust = thrust;
    }
    
    

    
}
