package Duplicate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101,"aaa",10000));
		list.add(new Employee(102,"bbb",20000));
		list.add(new Employee(103,"ccc",30000));
		list.add(new Employee(104,"ddd",40000));
		list.add(new Employee(105,"eee",50000));
		
		list.add(new Employee(106,"fff",10000));
		list.add(new Employee(107,"ggg",20000)); 
		list.add(new Employee(108,"hhh",30000)); 
		list.add(new Employee(109,"iii",40000));
		list.add(new Employee(110,"jjj",50000));
		  
		list.add(new Employee(111,"kkk",10000)); 
		list.add(new Employee(112,"lll",20000)); 
		list.add(new Employee(113,"mmm",30000));
		list.add(new Employee(114,"nnn",40000)); 
		list.add(new Employee(115,"ooo",50000));
		  
		list.add(new Employee(116,"ppp",10000)); 
		list.add(new Employee(117,"qqq",20000)); 
		list.add(new Employee(118,"rrr",30000));
		list.add(new Employee(119,"sss",40000)); 
		list.add(new Employee(120,"ttt",50000));
		 
		
		Map<Integer,Employee> map = new HashMap<>();
		
	
		
		for(Employee emp:list) {
			
			if(map.containsKey(emp.getSalary())) {
				
				Employee employee = map.get(emp.getSalary());
									
				map.put(emp.getSalary(), new Employee(emp.getId(),emp.getName(),emp.getSalary()+employee.getSalary()));
				
				
			}else {
				map.put(emp.getSalary(),new Employee(emp.getId(),emp.getName(),emp.getSalary()));	
			}
		}
		System.out.println(map);
		
		

	}

}
