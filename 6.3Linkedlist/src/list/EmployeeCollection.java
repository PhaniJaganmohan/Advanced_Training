package list;

import java.util.LinkedList;
import java.util.Vector;

public class EmployeeCollection {
	
	private static LinkedList<Employee> addInput() {
		Employee e1 = new Employee(100, "nischith","bangalore");
		Employee e2 = new Employee(101, "rashmi","mangalore");
		Employee e3 = new Employee(101, "naveen","bangalore");
		LinkedList<Employee> e = new LinkedList<>();
		e.add(e1);
		e.add(e2);
		e.add(e3);
		return e;
	}

	public static void display(LinkedList<Employee>v)
	{
		for(Employee e:v)
		{
			System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getAddress());
		}
	}

	public static void main(String[]args) {

		LinkedList<Employee> e = addInput();
		display(e);
		
		
	}
	
	

}
