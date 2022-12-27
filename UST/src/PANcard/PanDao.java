package PANcard;

import java.util.ArrayList;
import java.util.List;

public class PanDao {
	
	public List<PanModel> getDetails(){
		List<PanModel> list = new ArrayList<>();
		list.add(new PanModel(101,"CIQPP1234B"));
		list.add(new PanModel(102,"ABCD12345B"));
		list.add(new PanModel(104,"1234B"));
		return list;
		
	}
	
	
	
	
	
	

}
