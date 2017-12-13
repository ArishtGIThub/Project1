package pkg2;

import java.util.Scanner;

public class FebonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,i,n3;
		System.out.println(n1+" "+n2);
		System.out.println("Enter the count value");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(i=0;i<count;++i)
		{
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}

	}

}
