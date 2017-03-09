package programs;

import java.util.Comparator;

class Employee implements Comparable, Comparator{
		private int id;
		private String name;
		Employee(){
			
		}
		Employee(int id, String name){
			this.id=id;
			this.name=name;
		}
		public String getName(){
			return this.name;
		}
		
		public String toString(){
			//System.out.println("Inside toString Method of  Employee CLass");
			return id+"--"+name;
			
		}
	 
		@Override
		public int compareTo(Object o) {
			//System.out.println("Inside Compare To Method");
			int eid1=this.id;
			Employee e=(Employee)o;
			int eid2=e.id;
			if(eid1<eid2){
				return -1;
			}
			else if(eid1>eid2){
				return 1;
			}
			else
			return 0;
		}
		@Override
		public int compare(Object obj1, Object obj2){
			Employee e1=(Employee)obj1;
			Employee e2=(Employee)obj2;
			String s1=e1.getName();
			String s2=e2.getName();
			
			return s1.compareTo(s2);
			}
		

	}

