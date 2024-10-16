package com.nikepulow.collector.repository;

import com.nikepulow.collector.model.Miniature;
import com.nikepulow.collector.model.State;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StateRepository extends CrudRepository<State, Long> {
    Optional<State> findById(Long id);
    Optional<State> findByName(String name);
    Optional<State> findByMiniatures(Miniature miniatures);
    List<State> findAll();
}
