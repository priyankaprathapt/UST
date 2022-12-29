package reduce;

import java.util.Arrays;
import java.util.List;

public class ResduceFnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		  // 1st argument, init value = 0
		 // int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
		 
		 // System.out.println("sum : " + sum);
		  
		  
		  List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		  numbers.stream().
		  reduce(0, (a, b) -> a + b);
	}

}
