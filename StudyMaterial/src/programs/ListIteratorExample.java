package programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l=new LinkedList<String>();
		l.add("Rahul");
		l.add("Jaishri");
		l.add("Krithishya");
		l.add("Johny");
		System.out.println(l);
		ListIterator<String> ltr=l.listIterator();
		while(ltr.hasNext()){
			System.out.println(ltr.next());
		}
		
	}

}
