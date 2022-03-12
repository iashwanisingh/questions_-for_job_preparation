package firstjava;
import java.util.*;

public class PallindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        
        String str1 = str;
      
        
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        
        if(str.equals(str1)) {
        	System.out.println("Pallindrome");
        }
        else {
        	System.out.println("not pallindrome");
        }
        
        
        
        
       
        
       	}

}
