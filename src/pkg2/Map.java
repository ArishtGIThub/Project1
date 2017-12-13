package pkg2;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
	
	public static void main(String []args){
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter Number of Contacts");
	    int n = in.nextInt();
	    HashMap<String,Integer> phoneBook = new HashMap<String,Integer>(); 

	    for(int i = 0; i < n; i++){
	    	System.out.println("Enter Name");
	        String name = in.next();
	        System.out.println("Enter Number");
	        int phone = in.nextInt();

	        //add each name and number to the phonebook.
	        phoneBook.put(name, phone);
	        System.out.println(phoneBook.get(name));
	    }

	    while(in.hasNext()){
	    	System.out.println("Enter String");
	        String s = in.next();

	//if name is not found (null), print "Not found" to the console.        Otherwise, print name + "=" + phone number.

	            if (phoneBook.get(s) == null){
	                System.out.println("Not found");
	            }

	            else {
	                System.out.println(s + "=" + phoneBook.get(s));
	            }


	    }
	    in.close();
	}
	}

