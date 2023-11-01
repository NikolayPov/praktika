package com.example.test.model;

public class SupplierModel {
    private int id;
    private String name;
    private String nameprodukt;
    private String address;
    private int inn;

    public SupplierModel(){}

    public SupplierModel(int id, String name, String nameprodukt , String address, int inn){
        this.id = id;
        this.name = name;
        this.nameprodukt = nameprodukt;
        this.address = address;
        this.inn = inn;
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

    public String getNameprodukt() {
        return nameprodukt;
    }

    public void setNameprodukt(String nameprodukt) {
        this.nameprodukt = nameprodukt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }
}
