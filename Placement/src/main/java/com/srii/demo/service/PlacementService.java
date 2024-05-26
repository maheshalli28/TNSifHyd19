package com.srii.demo.service;

import java.util.List;

import com.srii.demo.entity.Placement;

public interface PlacementService {

	Placement save(Placement placement);

	List<Placement> fetchPlacementList();

	Placement fetchPlacementById(Long id);

	void deletePlacementById(Long id);

}
