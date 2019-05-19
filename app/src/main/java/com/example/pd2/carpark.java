package com.example.pd2;

public class carpark {
    private String name;
    private String cost;
    private String lot;

    public carpark(String name, String cost, String lot) {
        this.name = name;
        this.cost = cost;
        this.lot = lot;

    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public String getLot() {
        return lot;
    }

}
