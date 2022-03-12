package firstjava;
import java.util.*;

public class EvenOdd {
  public static void main(String[] args) {
	  // Scanner class for taking  input 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number : ");
	
	int num = sc.nextInt(); //taking number as a input
	
	if(num%2 == 0) {//condition for even number
		System.out.println(num+" is Even");
	}
	else {
		System.out.println(num+" is is odd");
	}
	 
	
 }
}
