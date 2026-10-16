package com.lastma.data.models;

public class Vehicle {
    private String PlateNumber;
    private String brand;
    private String color;
    private String Id;

    public Vehicle(String plateNumber, String brand, String color, String id) {
        PlateNumber = plateNumber;
        this.brand = brand;
        this.color = color;
        Id = id;
    }

    public String getPlateNumber() {
        return PlateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        PlateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}