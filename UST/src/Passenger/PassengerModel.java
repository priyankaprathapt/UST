package Passenger;

public class PassengerModel {
	
	private int id;
	private String name;
	private String source;
	private String designation;
	private int km;
	
	
	
	public PassengerModel(int id, String name, String source, String designation, int km) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.designation = designation;
		this.km = km;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	@Override
	public String toString() {
		return "PassengerModel [id=" + id + ", name=" + name + ", source=" + source + ", designation=" + designation
				+ ", km=" + km + "]";
	}
	
	
	

}
