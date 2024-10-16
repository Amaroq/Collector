package com.nikepulow.collector.model;

// package imports
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

// class imports


@Getter
@Setter
@Entity
public class Manufacturer {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    @NotEmpty private String name;
    @JsonIgnore
    @OneToMany(mappedBy="manufacturer") private List<Miniature> miniatures;
    @OneToMany(mappedBy="manufacturer") private List<Material> materials;

    // empty constructor
    public Manufacturer() {}

    // constructor
    public Manufacturer(String name) {
            this.name = name;
            this.miniatures = new ArrayList<>();
            this.materials = new ArrayList<>();
    }
}
