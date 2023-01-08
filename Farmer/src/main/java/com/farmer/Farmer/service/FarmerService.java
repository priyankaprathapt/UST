package com.farmer.Farmer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.farmer.Farmer.Repository.CropsRepositiory;
import com.farmer.Farmer.Repository.FarmerRepositiory;
import com.farmer.Farmer.model.Crops;
import com.farmer.Farmer.model.farmer;

@Service
public class FarmerService {
	
	@Autowired
	FarmerRepositiory repo;
	
	@Autowired
	CropsRepositiory repo1;

	public farmer saveFarmer(farmer data) {
		return repo.save(data);
	}

	public Crops saveCrops(Crops data1) {
		return repo1.save(data1);
	}
	
	

}
