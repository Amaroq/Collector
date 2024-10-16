package com.nikepulow.collector.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class State {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
    // own attributes
    String name;
    // connections to other classes
    @OneToMany(mappedBy = "state") private List<Miniature> miniatures;

    // constructors
    public State() {};

    public State(String name) {
        this.name = name;
        miniatures = new ArrayList<>();
    }

}
