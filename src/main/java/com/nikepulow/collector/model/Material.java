package com.nikepulow.collector.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Material {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    // own attributes
    private String name;
    private LocalDate acquiredOn;
    private Boolean wishlisted;
    private String type;
    // connections to other classes
    @ManyToMany(mappedBy = "materials") private List<Project> projects; // non owning side
    @ManyToOne private Manufacturer manufacturer;
    @ManyToOne private User user;


    // constructors
    public Material() {}

    public Material(String name, LocalDate acquiredOn, String type, Manufacturer manufacturer) {
        this.name = name;
        this.acquiredOn = acquiredOn;
        this.type = type;
        this.manufacturer = manufacturer;
        wishlisted = false;
        projects = new ArrayList<>();
    }

}
