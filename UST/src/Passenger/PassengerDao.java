package Passenger;

import java.util.ArrayList;
import java.util.List;


public class PassengerDao {
	
	public List<PassengerModel> getDetails(){
		
		List<PassengerModel> list = new ArrayList<>();
		list.add(new PassengerModel(101,"priyanka","kkd","tvm",300));
		list.add(new PassengerModel(102,"govardhan","tn","kk",60));
		list.add(new PassengerModel(103,"sreepriya","idk","tvm",100));
		list.add(new PassengerModel(104,"bhagya","tvm","bng",400));
		
	
		
		
		return list;
		
	}

}
