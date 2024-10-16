package com.nikepulow.collector.repository;

import com.nikepulow.collector.model.Material;
import com.nikepulow.collector.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Long> {
    Optional<Material> findById(Long id);
    Optional<Material> findByName(String name);
    List<Material> findByProjects(List<Project> projects);
    List<Material> findAll();
}
