package firstjava;

import java.util.Scanner;

public class CurrecyConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount in Rupees : ");
		
		float rs = sc.nextFloat();
		
		System.out.println("Amount in USD :$"+ rs/75.5);
		
		

	}

}
