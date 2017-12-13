package pkg1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the factorial");
		int num = scan.nextInt();
		for(int i=num;i>1;i--)
		{
		   fact=fact*i;
		}
		/*while(num>0)
		{
			fact=fact*num;
			num--;
		}*/
		System.out.println("Value of factorial "+num+" is:"+fact);

	}

}
