package com.nikepulow.collector.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Box {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    // own attributes
    private String name;
    private Float price;
    // connections to other classes
    @ManyToOne private User user;
    @OneToMany(mappedBy = "box") private List<Miniature> miniatures;

    // constructors
    public Box() {}

    public Box(String name, Float price) {
        this.name = name;
        this.price = price;
        miniatures = new ArrayList<>();
    }
}
