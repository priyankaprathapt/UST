package WithoutSort;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	
	public List<Employee> getDetails(){
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(103,"abc"));
		emp.add(new Employee(105,"cde"));
		emp.add(new Employee(101,"efg"));
		emp.add(new Employee(102,"hij"));
		return emp;
		
	}
	
	
	

}
