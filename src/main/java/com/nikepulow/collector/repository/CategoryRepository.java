package com.nikepulow.collector.repository;

import com.nikepulow.collector.model.Category;
import com.nikepulow.collector.model.CategoryTemplate;
import com.nikepulow.collector.model.Miniature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findById(Long id);
    Optional<Category> findByName(String name);
    Optional<Category> findByTemplate(CategoryTemplate CategoryTemplate);
    List<Category> findAll();
}
