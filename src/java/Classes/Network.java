/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/licenseprivate default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Enums.*;

/**
 *
 * @author ervin
 */
public class Network {
    private String netName;
    private String netType;
    private Switching cswitched;
    private Status netStatus;
    private double bandwidth;
    private double optimumBW;
    private double maxBW;
    private double minBW;

    public Network() {
    }

    public Network(String netName, String netType, Switching cswitched, Status netStatus, double bandwidth, double optimumBW, double maxBW, double minBW) {
        this.netName = netName;
        this.netType = netType;
        this.cswitched = cswitched;
        this.netStatus = netStatus;
        this.bandwidth = bandwidth;
        this.optimumBW = optimumBW;
        this.maxBW = maxBW;
        this.minBW = minBW;
    }
    
    @Override
    public String toString(){
        return "";
    }

    public String getNetName() {
        return netName;
    }

    public void setNetName(String netName) {
        this.netName = netName;
    }

    public String getNetType() {
        return netType;
    }

    public void setNetType(String netType) {
        this.netType = netType;
    }

    public Switching getCswitched() {
        return cswitched;
    }

    public void setCswitched(Switching cswitched) {
        this.cswitched = cswitched;
    }

    public Status getNetStatus() {
        return netStatus;
    }

    public void setNetStatus(Status netStatus) {
        this.netStatus = netStatus;
    }

    public double getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(double bandwidth) {
        this.bandwidth = bandwidth;
    }

    public double getOptimumBW() {
        return optimumBW;
    }

    public void setOptimumBW(double optimumBW) {
        this.optimumBW = optimumBW;
    }

    public double getMaxBW() {
        return maxBW;
    }

    public void setMaxBW(double maxBW) {
        this.maxBW = maxBW;
    }

    public double getMinBW() {
        return minBW;
    }

    public void setMinBW(double minBW) {
        this.minBW = minBW;
    }
    
    
}
