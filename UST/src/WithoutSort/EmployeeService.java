package WithoutSort;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> nlist = new EmployeeDao().getDetails();
		TreeSet<Employee> tset = new TreeSet<Employee>(nlist);
		
		System.out.println(tset);
		

	}

}
