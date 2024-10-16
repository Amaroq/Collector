package com.nikepulow.collector.repository;

import com.nikepulow.collector.model.LabelTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LabelTemplateRepository extends CrudRepository<LabelTemplate, String> {
    Optional<LabelTemplate> findByName(String name);
    Optional<LabelTemplate> findById(Long id);
    List<LabelTemplate> findAll();
}
