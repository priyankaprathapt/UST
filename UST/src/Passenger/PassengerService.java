package Passenger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PassengerService {

	public static void main(String[] args) {
		List<PassengerModel> nlist = new PassengerDao().getDetails();
		
		Map<PassengerModel,Integer> map = new HashMap<>();
		int km_per = 5;
		int amount = 0;
		for(PassengerModel pass : nlist) {
			
			amount = pass.getKm()*km_per;
			map.put(new PassengerModel(pass.getId(),pass.getName(),pass.getSource()
					,pass.getDesignation(),pass.getKm()), amount);
			
			
		}
		
		System.out.println(map);
		

	}

}
