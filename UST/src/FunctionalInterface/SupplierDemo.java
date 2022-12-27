package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("priyanka");
		list.add("sreepriya");
		list.add("govardhan");
		list.add("sreepriya");

       Supplier<List<String>> supplier = () -> new ArrayList<>(list);
       Supplier<List<String>> supplier1 = () -> list.stream().collect(Collectors.toList());
        
        System.out.println(supplier.get());
        System.out.println(supplier1.get());

      
	}

}
