package pkg1;
import java.util.Scanner;

public class ReverseString {
	static{
System.out.println("Hello");
	}
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String A=sc.next();
        sc.close();
        String reverse = "";
        /* Enter your code here. Print output to STDOUT. */
       for(int i=A.length()-1;i>=0;--i)
        {
        reverse=reverse+A.charAt(i);
       
        }
       if(reverse.equals(A))
       {
    	   System.out.println("Yes");
       }
       else
       {
    	   System.out.println("No");
    
       }
    
    }
}
