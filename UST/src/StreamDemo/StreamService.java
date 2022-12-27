package StreamDemo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamService {
	
	
	public List<StreamModel> getSortedList(){
		
		List<StreamModel> nlist = new StreamDao().getEmpList();
		
		Optional<List<StreamModel>> oplist = Optional.ofNullable(nlist);
		
		List<StreamModel> sorted = null;
		
		if(oplist.isPresent()) {
			
		
			
			sorted = nlist.stream().filter(p->p.getLocation()=="hyd").collect(Collectors.toList());

		
		}
		return sorted;
		
		
		//List<StreamModel> sorted1 = (List<StreamModel>) nlist.stream().collect(Collectors.groupingBy(p->p.getLocation()));

		
		
	}

	public static void main(String[] args) {
		System.out.println(new StreamService().getSortedList());

	}

}
