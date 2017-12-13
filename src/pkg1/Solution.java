package pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
    	 String smallest = "";
         String largest = "";
    	try{
       
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        List<String> list = new ArrayList<String>();  
           for (int i = 0; i < s.length(); i = i + 1) {  
                if (s.length() - i >= k) {  
                     list.add(s.substring(i, k + i));  
                }
               
           }  
           Collections.sort(list);
        smallest = list.get(0);
        largest = list.get(list.size()-1);
        
    	}
    	catch(IndexOutOfBoundsException err)
    	{
    		System.out.println("Out of Bound");
    	}
    	return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = scan.next();
        System.out.println("Enter the Integer");
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
      
   }
    
}
