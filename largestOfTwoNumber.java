package firstjava;

import java.util.Scanner;

public class largestOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two number");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Largest number is : "+(num1>num2 ? num1 : num2));
		
		

	}

}
