package com.example.th83;

public class Bottle {

    private String name;
    private String manufacturer;
    private double total_energy;
    private float size;
    private float price;


    public Bottle(String a, float b, float c){
        name = a;
        size = b;
        price = c;
    }

    public String getName(){
        return name;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public double getEnergy(){
        return total_energy;
    }

    public float getSize() {
        return size;
    }

    public float getPrice() {
        return price;
    }
}
