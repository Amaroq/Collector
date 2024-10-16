package com.nikepulow.collector.model;

// package imports
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class Miniature {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    // own attributes
    private String name;
    private LocalDate acquiredOn;
    private String description;
    private Boolean wishlisted;
    private Float price;
    // connections to other classes
    @ManyToOne private Box box;
    @ManyToOne private State state;
    @ManyToOne private Project project;
    @ManyToOne private Category category;
    @ManyToOne private Manufacturer manufacturer;
    @ManyToOne private User user;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name="MINIATURE_LABELS") private List<Label> labels;


    // empty constructor
    public Miniature() {}

    // constructor for bought miniature with
    // description, manufacturer, labels, categories
    // without
    // box, state
    public Miniature(String name, LocalDate aquiredOn, String description, Float price,
                     List<Label> labels, Project project, Manufacturer manufacturer, Category category) {
        this.name = name;
        this.acquiredOn = aquiredOn;
        this.description = description;
        this.price = price;
        this.labels = labels;
        this.project = project;
        this.manufacturer = manufacturer;
        this.wishlisted = false;
        this.category = category;
    }

    // TODO more constructors, alternatively always use empty constructor and setter methods
}
