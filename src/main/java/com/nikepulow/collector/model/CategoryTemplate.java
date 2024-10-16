package com.nikepulow.collector.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class CategoryTemplate {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    private String name;
    @OneToMany(mappedBy = "template") private List<Category> categories;

    public CategoryTemplate() {}

    public CategoryTemplate(String name) {
        this.name = name;
    }
}
