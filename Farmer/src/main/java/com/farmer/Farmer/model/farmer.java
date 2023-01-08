package com.farmer.Farmer.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class farmer {
	
	@Id
	@GeneratedValue	
	private int landid;
	private String name;
    private String address;
    private int landinacres;
    @OneToMany
    @JoinColumn(name="surveyno")
	 private List<Crops> crop;
    
    
    
    
    
	public farmer(int landid, String name, String address, int landinacres, List<Crops> crop) {
		super();
		this.landid = landid;
		this.name = name;
		this.address = address;
		this.landinacres = landinacres;
		this.crop = crop;
	}
	public int getLandid() {
		return landid;
	}
	public void setLandid(int landid) {
		this.landid = landid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLandinacres() {
		return landinacres;
	}
	public void setLandinacres(int landinacres) {
		this.landinacres = landinacres;
	}
	public List<Crops> getCrop() {
		return crop;
	}
	public void setCrop(List<Crops> crop) {
		this.crop = crop;
	}
    
    
    

     
	
	
	
}
