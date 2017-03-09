package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee(51332131,"Raghul");
		Employee e2=new Employee(47736399,"Aanand");
		Employee e3=new Employee(79834799,"Mukund");
		Employee e4=new Employee(59893983,"Mukond");
		
		List l=new ArrayList();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		
		List l1=new ArrayList();
		l1.add("x");
		l1.add("y");
		l1.add("a");
		l1.add("f");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		Collections.sort(l,new Employee());
		System.out.println(l);
		Collections.sort(l1);
		System.out.println(l1);
		

	}

}
