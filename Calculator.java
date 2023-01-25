package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		do {
			System.out.println("Enter two numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
		System.out.println("Choose your operation:");
		System.out.println("1) Addition");
		System.out.println("2) Subtration");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");
		c=sc.nextInt();
		double result=0;
		switch(c) {
		case 1 :result=a+b;
		System.out.println("The answer is: "+result); 
		System.out.println();
		break;
		case 2 :result=a-b;
		System.out.println("The answer is: "+result);
		System.out.println();
		break;
		case 3 :result=a*b;
		System.out.println("The answer is: "+result); 
		System.out.println();
		break;
		case 4 :
			if(b==0) {
				System.out.println("error");
			}
			 else {
				result=a/b;
				System.out.println("The answer is: "+result);
				System.out.println();
				break;
			}
		default: System.out.println("Invalid choice");
		
		}
		}while(c<=4);	
	}	

}
