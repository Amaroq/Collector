package com.nikepulow.collector.repository;

import com.nikepulow.collector.model.Material;
import com.nikepulow.collector.model.Miniature;
import com.nikepulow.collector.model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
    Optional<Project> findById(Long id);
    Optional<Project> findByName(String name);
    Optional<Project> findByMiniatures(List<Miniature> miniatures);
    Optional<Project> findByMaterials(List<Material> materials);
    List<Project> findAll();
}
