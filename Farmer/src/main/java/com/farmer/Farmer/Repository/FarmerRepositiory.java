package com.farmer.Farmer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmer.Farmer.model.farmer;

@Repository
public interface FarmerRepositiory extends JpaRepository<farmer, Integer>{

}
