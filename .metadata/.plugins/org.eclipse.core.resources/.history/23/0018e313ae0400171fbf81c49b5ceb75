package programs;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber=sc.nextInt();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the second number");
		int secondNumber=sc.nextInt();
		int product=firstNumber*secondNumber;
		NumberPalindrome npal=new NumberPalindrome();
		npal.maxPalindrome(product);
	}

	public void maxPalindrome(int product){
		String s=Integer.toString(product);
		System.out.println("The product is "+s);
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
			reverse=reverse+s.charAt(i);
		 
		}
		System.out.println("The reversed is "+reverse);
	}
}
