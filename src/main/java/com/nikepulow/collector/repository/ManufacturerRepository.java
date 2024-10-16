package com.nikepulow.collector.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nikepulow.collector.model.Manufacturer;

import java.util.List;
import java.util.Optional;

@Repository
public interface ManufacturerRepository extends CrudRepository<Manufacturer, Long> {
    Optional<Manufacturer> findByName(String name);
    Optional<Manufacturer> findById(Long id);
    List<Manufacturer> findAll();
}
