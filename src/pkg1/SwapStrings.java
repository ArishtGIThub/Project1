package pkg1;

import java.util.Scanner;

public class SwapStrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String:");
		String a = scan.next();
		System.out.println("Enter Second String:");
		String b = scan.next();
		a = a + b;
		b = a.substring(0, a.length()-b.length());
		a = a.substring(b.length());
		System.out.println("Value of First String: " +a);
		System.out.println("Value of Second String: " +b);

	}

}
