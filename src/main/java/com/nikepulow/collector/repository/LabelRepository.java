package com.nikepulow.collector.repository;

import com.nikepulow.collector.model.Label;
import com.nikepulow.collector.model.LabelTemplate;
import com.nikepulow.collector.model.Miniature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LabelRepository extends CrudRepository<Label, Long> {
    Optional<Label> findById(Long id);
    Optional<Label> findByName(String name);
    List<Label> findByTemplate(LabelTemplate template);
    List<Label> findByMiniatures(List<Miniature> miniatures);
    List<Label> findAll();
}
