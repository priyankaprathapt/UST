package Collection;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(101,"priyanka");
		map.put(102,"sreepriya");
		map.put(103,"sona");
		map.put(104,"gopu");
		for(Map.Entry nmap:map.entrySet()) {
			
			if(nmap.getValue().toString().startsWith("s")) {
				System.out.print(nmap.getKey()+" "+nmap.getValue());
			}
			
		}
		
		Map result = map.entrySet().stream().filter(p->p.getValue().toString().startsWith("s")).collect(Collectors.toMap(e->e.getKey(), e->e.getValue()));
		
System.out.print(result);
	}

}
