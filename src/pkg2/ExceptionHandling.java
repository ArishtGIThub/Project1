package pkg2;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String args[])
	{
       Scanner sc = new Scanner(System.in);

		
			System.out.println("Enter first Number");
			int n = sc .nextInt();
			System.out.println("Enter Second Number");
			int p = sc .nextInt();

			try {
				
				if(n<0 || p<0)
				{
					throw new Exception("Numbers should be non-negative");
				}
				else if(n==0 && p==0)
				{
					throw new Exception("Numbers cannot be zero");
				}
				System.out.println(Math.pow(n,p));
				
			} catch (Exception e) {
				System.out.println("Invalid Numbers");
			}
		}
	
}
