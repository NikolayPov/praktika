package com.example.test.model;

public class CarModel {

    private int id;
    private String name;
    private int price;
    private String type;
    private int number;

    public CarModel(){}

    public CarModel(int id, String name, int price, String type, int number){
        this.id = id;
        this.number = number;
        this.price = price;
        this.type = type;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
