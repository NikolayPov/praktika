package com.example.cruddemo.models;

import javax.persistence.*;
import java.util.List;
@Table(name = "drink")
@Entity
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany
    @JoinTable (name="drink_chashka",
            joinColumns=@JoinColumn (name="drink_id"),
            inverseJoinColumns=@JoinColumn(name="chashka_id"))
    private List<Chashka> chashkas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Chashka> getChashkas() {
        return chashkas;
    }

    public void setChashkas(List<Chashka> chashkas) {
        this.chashkas = chashkas;
    }
}

