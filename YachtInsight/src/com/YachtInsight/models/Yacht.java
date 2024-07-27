/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.YachtInsight.models;

/**
 *
 * @author proge
 */
public class Yacht {
    private String sn;
    private String name;
    private String shipyard;
    private String built;
    private String cabins;
    private String speed;
    private String size;
    private String length;
    private String price;

    // Constructor
    public Yacht(String sn, String name, String shipyard, String built, String cabins,
                 String speed, String size, String length, String price) {
        this.sn = sn;
        this.name = name;
        this.shipyard = shipyard;
        this.built = built;
        this.cabins = cabins;
        this.speed = speed;
        this.size = size;
        this.length = length;
        this.price = price;
    }

    // Getters
    public String getSn() {
        return sn;
    }

    public String getName() {
        return name;
    }

    public String getShipyard() {
        return shipyard;
    }

    public String getBuilt() {
        return built;
    }

    public String getCabins() {
        return cabins;
    }

    public String getSpeed() {
        return speed;
    }

    public String getSize() {
        return size;
    }

    public String getLength() {
        return length;
    }

    public String getPrice() {
        return price;
    }

    // Setters
    public void setSn(String sn) {
        this.sn = sn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShipyard(String shipyard) {
        this.shipyard = shipyard;
    }

    public void setBuilt(String built) {
        this.built = built;
    }

    public void setCabins(String cabins) {
        this.cabins = cabins;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

