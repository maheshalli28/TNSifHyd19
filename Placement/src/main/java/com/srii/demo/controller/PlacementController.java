package com.srii.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srii.demo.entity.Placement;
import com.srii.demo.service.PlacementService;

@RestController
public class PlacementController {

	@Autowired
	PlacementService s1;
	
	@PostMapping("/placements")
	public Placement savePlacement(@RequestBody Placement placement) {
    	
    	return s1.save(placement);
		
	}
	
	 @GetMapping("/placements")
	    public List<Placement> fetchPlacementList() {
	        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
	        return s1.fetchPlacementList();
	    }
	
	 
	 
	 @GetMapping("/placements/{id}")
	    public Placement fetchPlacementById(@PathVariable("id") Long id)
	            {
	        return s1.fetchPlacementById(id);
	    }
	 
	 
	  @DeleteMapping("/placements/{id}")
	    public String deletePlacementById(@PathVariable("id") Long id) {
		  s1.deletePlacementById(id);
	        return "Placement deleted Successfully!!";
	    }
	 
}
