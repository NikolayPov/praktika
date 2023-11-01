package com.example.cruddemo.models;

import javax.persistence.*;
import java.util.List;
@Table(name = "chashka")
@Entity
public class Chashka {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @ManyToMany
    @JoinTable (name="drink_chashka",
            joinColumns=@JoinColumn (name="drink_id"),
            inverseJoinColumns=@JoinColumn(name="chashka_id"))
    private List<Drink> drinks;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }
}
