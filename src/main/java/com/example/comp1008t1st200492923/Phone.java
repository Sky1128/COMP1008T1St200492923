package com.example.comp1008t1st200492923;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Phone {

    private String Make;
    private String Model;
    private int memory;
    private double price;


    public String getMake() {
        return Make;
    }

    public void setMake(String make) {
        Make = make;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Phone(String phoneMake, String phoneModel, int phoneMemory, double phonePrice)
    {
        Make = phoneMake;
        Model = phoneModel;
        memory = phoneMemory;
        price = phonePrice;
    }

    public String toString()
    {
     String phoneDetails = this.Make + " - " + this.Model + "Memory :" + this.memory + "Price : $" + this.price;
     return phoneDetails;
    }

}