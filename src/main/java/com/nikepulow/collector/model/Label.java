package com.nikepulow.collector.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Label {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    // own attributes
    private String name;
    // connections to other classes
    @ManyToMany(mappedBy = "labels") private List<User> users; // non owning side
    @ManyToMany(mappedBy = "labels") private List<Miniature> miniatures; // non owning side
    @ManyToOne private LabelTemplate template;

    // constructor
    public Label() {}

    public Label(String name) {
        this.name = name;
        users = new ArrayList<>();
        miniatures = new ArrayList<>();
    }
}
