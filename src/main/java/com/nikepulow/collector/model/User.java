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
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    // own attributes
    private String username;
    private String password;
    private String email;
    private LocalDate lastUsernameChange;
    // connections to other classes
    @OneToMany(mappedBy = "user") List<Miniature> miniatures;
    @OneToMany(mappedBy = "user") List<Material> materials;
    @OneToMany(mappedBy = "user") List<Project> projects;
    @OneToMany(mappedBy = "user") List<Box> boxes;

    @ManyToMany
    @JoinTable(name="USER_CATEGORIES") private List<Category> categories;
    @ManyToMany
    @JoinTable(name="USER_LABELS") private List<Label> labels;

    // constructors
    public User() {}

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        lastUsernameChange = LocalDate.now();
        miniatures = new ArrayList<>();
        materials = new ArrayList<>();
        projects = new ArrayList<>();
        boxes = new ArrayList<>();
        categories = new ArrayList<>();
        labels = new ArrayList<>();
    }

}
