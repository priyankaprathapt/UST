package com.farmer.Farmer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmer.Farmer.model.Crops;
import com.farmer.Farmer.model.farmer;
import com.farmer.Farmer.service.FarmerService;

@RestController
@RequestMapping("/api/farmer")
public class FarmerController {
	
	@Autowired
	FarmerService service;
	 
	
	
	@PostMapping("/saveFarmer")	
	public farmer saveFarmer(farmer data) {
		return service.saveFarmer(data);
		
	}
	
	@PostMapping("/saveCrops")	
	public Crops saveCrops(Crops data1) {
		return service.saveCrops(data1);
		
	}

}
