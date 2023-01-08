package com.farmer.Farmer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmer.Farmer.model.Crops;

@Repository
public interface CropsRepositiory extends JpaRepository<Crops, Integer>{

}
