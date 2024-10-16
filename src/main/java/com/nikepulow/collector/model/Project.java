package com.nikepulow.collector.model;

// package imports
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// class imports

@Getter
@Setter
@Entity
public class Project {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    // project attributes
    private String name;
    private String description;
    private LocalDate deadline;
    private Boolean finished;
    // connections to other classes
    @OneToMany private List<Miniature> miniatures;
    @ManyToMany private List<Material> materials;
    @ManyToOne private User user;

    // empty constructor
    public Project() {}

    public Project(String name, String description, LocalDate deadline, User user) {
        this.name = name;
        this.description = description;
        this.deadline = deadline;
        this.user = user;
        finished = false;
        miniatures = new ArrayList<>();
        materials = new ArrayList<>();
    }
}
