package Collection;

import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("priyanka");
		list.add("sreepriya");
		list.add("sona");
		list.add("gopu");
		
		for(String nlist:list) {
		if(nlist.startsWith("s")) {
			System.out.println(nlist);
			
			
		}
		
		list.stream().filter(p->p.startsWith("s")).forEach(System.out::println);
			
			
		}
		
		
		

	}

}
