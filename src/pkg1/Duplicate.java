package pkg1;

import java.util.Scanner;

public class Duplicate {


	public static void main(String[] args) {
		int count=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.next();
		System.out.println("Duplicate elements are:");
		char[] c = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(c[i]==c[j]&& i!=j)
				{
					System.out.println(c[j]);
					//count++;
					//break;

				}
			}
		}

	}

}
