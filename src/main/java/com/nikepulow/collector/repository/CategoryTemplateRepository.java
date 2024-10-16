package com.nikepulow.collector.repository;

import com.nikepulow.collector.model.Category;
import com.nikepulow.collector.model.CategoryTemplate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryTemplateRepository extends CrudRepository<CategoryTemplate, Long> {
    Optional<CategoryTemplate> findByName(String name);
    Optional<CategoryTemplate> findById(Long id);
    List<CategoryTemplate> findAll();
}
