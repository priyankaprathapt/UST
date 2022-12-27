package PANcard;

public class PanModel {
	
	private int uid;
	private String pancard;
	
	
	public PanModel(int uid, String pancard) {
		super();
		this.uid = uid;
		this.pancard = pancard;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	@Override
	public String toString() {
		return "PanModel [uid=" + uid + ", pancard=" + pancard + "]";
	}
	
	
	

}
