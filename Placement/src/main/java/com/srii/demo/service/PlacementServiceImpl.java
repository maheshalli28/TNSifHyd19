package com.srii.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srii.demo.entity.Placement;
import com.srii.demo.repository.PlacementRepository;


@Service
public class PlacementServiceImpl implements PlacementService {
	@Autowired
	
	PlacementRepository p1;

	@Override
	public Placement save(Placement placement) {
		// TODO Auto-generated method stub
		return p1.save(placement);
	}

	@Override
	public List<Placement> fetchPlacementList() {
		// TODO Auto-generated method stub
		return p1.findAll();
	}

	@Override
	public Placement fetchPlacementById(Long id) {
		// TODO Auto-generated method stub
		return p1.findById(id).get();
	}

	@Override
	public void deletePlacementById(Long id) {
		// TODO Auto-generated method stub
		p1.deleteById(id);
		
	}
	

}
