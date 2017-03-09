package programs;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={38,20,1,3,900,40,2,5000,4,66};
		int j,k,temp=0;
		for(int temp1:a){
			System.out.println("Before Sorting "+temp1);
			
		}
		
		
		for(int i=0;i<=a.length-1;i++){
			System.out.println(" ");
			for(int z=0;z<=a.length-1;z++){
				System.out.println(" ");
				if(a[i]<a[z]){
					System.out.print(" COmparing "+a[i]+" and"+a[z]);
					temp=a[z];
					a[z]=a[i];
					a[i]=temp;
					for(int temp1:a){
						System.out.print(" ||  "+temp1);
						
					}
				}
			}
		}
		
		

	}

}
