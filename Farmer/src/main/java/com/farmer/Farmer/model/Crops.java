package com.farmer.Farmer.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
//@Table(name="croptable")
public class Crops {
	
	@Id
	@GeneratedValue
	private int surveyno;
    private String cropname;
    private int landinacres;
    
    
    @ManyToOne
    private farmer farmer;
    
  

    
    

	public Crops(int surveyno, String cropname, int landinacres, com.farmer.Farmer.model.farmer farmer) {
		super();
		this.surveyno = surveyno;
		this.cropname = cropname;
		this.landinacres = landinacres;
		this.farmer = farmer;
	}






	public Crops() {
		super();
	}






	public int getSurveyno() {
		return surveyno;
	}






	public void setSurveyno(int surveyno) {
		this.surveyno = surveyno;
	}






	public String getCropname() {
		return cropname;
	}






	public void setCropname(String cropname) {
		this.cropname = cropname;
	}






	public int getLandinacres() {
		return landinacres;
	}






	public void setLandinacres(int landinacres) {
		this.landinacres = landinacres;
	}






	public farmer getFarmer() {
		return farmer;
	}






	public void setFarmer(farmer farmer) {
		this.farmer = farmer;
	}




    
	
    
    

}
