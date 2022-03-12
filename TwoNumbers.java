package firstjava;
import java.util.*;
public class TwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter two numbers : ");
		
		float num1 = sc.nextInt();
		
		float num2 = sc.nextInt();
		
		System.out.println("Enter operation you want to perform : ");
		char ch = sc.next().charAt(0);
		
		if(ch =='+') {
			
			System.out.println("Sum is "+(num1+num2));
			
		}
		else if(ch == '-') {
			System.out.println("Sub is "+(num1-num2));
		}
		else if(ch =='*') {
			System.out.println("Mul is "+(num1*num2));
		}
		else {
			System.out.println("Div is "+(num1>num2 ? num1/num2 : num2/num1));
		}
		
		
		

	}

}
