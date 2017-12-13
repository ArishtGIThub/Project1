package pkg2;

import java.io.IOException;

public class ReplaceAllExample {
	public static void main(String args[]) throws IOException { 
		Runtime.getRuntime().exec("C:\\Windows\\system32\\calc.exe");
	}
		/*String s1="My name is Khan Khan. My name is Bob Bob. My name is Sonoo.";  
		//String replaceString=s1.replaceAll("\\b([a-z]+)","");  
		String replaceString=s1.replaceAll("\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
		System.out.println(replaceString);  
		}*/
}
