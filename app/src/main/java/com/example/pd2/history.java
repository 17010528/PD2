package com.example.pd2;

public class history {
    private String name;
    private String cost;
    private String rate;
    private String paymentMethod;
    private String lot;

    public history(String name, String cost, String rate , String paymentMethod , String lot) {
        this.name = name;
        this.cost = cost;
        this.rate = rate;
        this.paymentMethod = paymentMethod;
        this.lot = lot;
    }

    public String getName() {
        return name;
    }

    public String getCost() {
        return cost;
    }

    public String getRate() {
        return rate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getLot() {
        return lot;
    }
}
