package StreamDemo;

import java.util.ArrayList;
import java.util.List;

public class StreamDao {

	public List<StreamModel> getEmpList(){
		
		List<StreamModel> list = new ArrayList<>();
		
		list.add(new StreamModel(101,"priyanka","hyd"));
		list.add(new StreamModel(102,"sreepriya","hyd"));
		list.add(new StreamModel(103,"rithu","hyd"));
		list.add(new StreamModel(104,"ruthin","chennai"));
		list.add(new StreamModel(105,"abc","chennai"));
		list.add(new StreamModel(106,"def","chennai"));
		
		
		
		
		return list;
		
		
	}
}
