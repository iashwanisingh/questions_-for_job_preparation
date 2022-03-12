package firstjava;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the prinicipal amount :");
		 
		Double p = sc.nextDouble();
		
		System.out.println("Enter the rate :");
		
		Double r = sc.nextDouble();
		
		
		System.out.println("Enter the time(in yrs) :");
		
		Double t = sc.nextDouble();
		
		Double si = (p*r*t)/100;
		
		System.out.println("Simple Interest is : "+ si);
		
		

	}

}
