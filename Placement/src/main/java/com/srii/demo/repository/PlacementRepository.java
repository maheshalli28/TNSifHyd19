package com.srii.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srii.demo.entity.Placement;

@Repository
public interface PlacementRepository extends JpaRepository<Placement, Long>{

}
