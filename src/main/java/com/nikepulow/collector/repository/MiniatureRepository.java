package com.nikepulow.collector.repository;

import com.nikepulow.collector.model.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface MiniatureRepository extends CrudRepository<Miniature, Long> {
    Optional<Miniature> findById(Long id);
    //List<Miniature> findByLabels(Label labels);
    List<Miniature> findByCategory(Category category);
    List<Miniature> findByState(State state);
    List<Miniature> findByWishlisted(boolean wishlisted);
    //List<Miniature> findByCategory(List<Category> category);
    List<Miniature> findByLabels(List<Label> labels);
    List<Miniature> findByProject(Project project);
    Optional<Miniature> findByName(String name);
    List<Miniature> findByAcquiredOn(LocalDate acquiredOn);
    List<Miniature> findAll();
}
