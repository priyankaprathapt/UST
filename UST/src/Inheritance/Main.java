package Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.model = "c7";
		c.name = "BMW";
		c.wheels = 4;
		c.display();
		
		Bus b = new Bus();
		b.model = "Ashok layland";
		b.name = "Bus";
		b.wheels=8;
		b.display();
		
		Lorry l = new Lorry();
		l.model = "Nissan";
		l.name = "Lorry";
		l.wheels=8;
		l.display();
		
		

	}

}
