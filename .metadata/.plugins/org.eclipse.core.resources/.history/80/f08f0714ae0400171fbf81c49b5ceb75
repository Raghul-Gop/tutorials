package programs;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			a.add(i);
			
		}
		System.out.println("Elements in the array list are : "+a);
		Iterator<Integer> ite = a.iterator();
		while(ite.hasNext()){
			Integer I=(Integer)ite.next();
			if(I%2==0)
			System.out.println(I);
			else
			ite.remove();
		}
		System.out.println("Elements in the array list after removing odd numbers : "+a);
	}
}
