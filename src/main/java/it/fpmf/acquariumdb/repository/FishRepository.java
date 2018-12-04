package it.fpmf.acquariumdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import it.fpmf.acquariumdb.model.Fish;

public interface FishRepository extends JpaRepository<Fish, Long>{


}
