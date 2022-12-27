package StreamDemo;

public class StreamModel {
	
	private int uid;
	private String name;
	private String location;
	
	
	public StreamModel(int uid, String name, String location) {
		super();
		this.uid = uid;
		this.name = name;
		this.location = location;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "StreamModel [uid=" + uid + ", name=" + name + ", location=" + location + "]";
	}
	
	
	

}
