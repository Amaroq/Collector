package com.nikepulow.collector.model;

// package imports
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.sql.Template;

import java.util.List;

@Getter
@Setter
@Entity
public class Category {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    @NotEmpty private String name;
    @ManyToMany(mappedBy = "categories") private List<User> users; //non owning side
    @OneToMany(mappedBy = "category") private List<Miniature> miniatures;
    @ManyToOne private CategoryTemplate template;

    public Category() {};

    public Category(String name) {
        this.name = name;
    }

}
