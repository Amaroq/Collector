package com.nikepulow.collector.repository;

import com.nikepulow.collector.model.Box;
import com.nikepulow.collector.model.Miniature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoxRepository extends CrudRepository<Box, Long> {
    Optional<Box> findById(Long id);
    Optional<Box> findByName(String name);
    Optional<Box> findByMiniatures(List<Miniature> miniatures);
    List<Box> findByPrice(Float price);
    List<Box> findAll();
}
