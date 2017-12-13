package pkg1;

public class Demo1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		try
		{
			call();
		}
		catch(Exception e)
		{
			System.out.println("Null Pointer");
		}
		finally
		{
			System.out.println("Final");
		}

	}
	
	public static void display(String s)
	{
		char[] chr = s.toCharArray();
		int i=0;
		System.out.println(s.length());
		for(i=0;i<s.length();i++){
			System.out.println(chr[i]);
		}
	}
	
	public static void call()
	{
		String Str="My name is Arisht";
		 display(Str);
	}

}
