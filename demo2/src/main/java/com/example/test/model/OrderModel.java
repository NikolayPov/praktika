package com.example.test.model;

public class OrderModel {

    private int id;
    private int number;
    private int totalPrice;
    private String address;
    private String status;

    public OrderModel(){}

    public OrderModel(int id, int number, int totalPrice, String address, String status){
        this.id = id;
        this.number = number;
        this.totalPrice = totalPrice;
        this.address = address;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
