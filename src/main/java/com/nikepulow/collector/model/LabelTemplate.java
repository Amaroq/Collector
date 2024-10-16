package com.nikepulow.collector.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class LabelTemplate {
    @Id @GeneratedValue(strategy = GenerationType.AUTO) private Long id;
    private String name;
    @OneToMany(mappedBy = "template") private List<Label> labels;

    public LabelTemplate() {}

    public LabelTemplate(String name) {
        this.name = name;
    }
}
