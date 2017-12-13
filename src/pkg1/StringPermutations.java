package pkg1;

import java.util.HashSet;
import java.util.Set;



public class StringPermutations {

	public static void main(String[] args)
	{
		String str = "ABC";
		int n = str.length();
		StringPermutations permutation = new StringPermutations();
		permutation.permute(str, 0, n-1);
	}

	/**
	 * permutation function
	 * @param str string to calculate permutation for
	 * @param l starting index
	 * @param r end index
	 */
	private void permute(String str, int l, int r)
	{
		if (l == r)
			System.out.println(str);
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}

	/**
	 * Swap Characters at position
	 * @param a string value
	 * @param i position 1
	 * @param j position 2
	 * @return swapped string
	 */
	public String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		System.out.println(temp);
		return String.valueOf(charArray);
	}

}

/*public static Set<String> permutationFinder(String str) {
        Set<String> perm = new HashSet<String>();
        //Handling error scenarios
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            perm.add("");
            return perm;
        }
        char initial = str.charAt(0); // first character
        String rem = str.substring(1); // Full string without first character
        Set<String> words = permutationFinder(rem);
        for (String strNew : words) {
            for (int i = 0;i<=strNew.length();i++){
                perm.add(charInsert(strNew, initial, i));
            }
        }
        return perm;
    }

    public static String charInsert(String str, char c, int j) {
        String begin = str.substring(0, j);
        String end = str.substring(j);
        return begin + c + end;
    }

    public static void main(String[] args) {
        String s = "PQR";
        String s1 = "ABC";
        String s2 = "ABCD";
        System.out.println("\nPermutations for " + s + " are: \n" + permutationFinder(s));
        System.out.println("\nPermutations for " + s1 + " are: \n" + permutationFinder(s1));
        System.out.println("\nPermutations for " + s2 + " are: \n" + permutationFinder(s2));
    }*/


/*public static void main(String[] args) {
		permutation("ARISHT");

	}
	/* * A method exposed to client to calculate permutation of String in Java. */ 
/*public static void permutation(String input)
	{ 
		permutation("", input); 
	} 


	private static void permutation(String perm, String word) 
	{ 
		if (word.isEmpty()) 
		{ 
			System.err.println(perm + word); 
		} 
		else 
		{ 
			for (int i = 0; i<word.length(); i++)
			{ 
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
				//System.out.println("perm:"+perm);
				//System.out.println("word:"+word);
			} 
		} 
	}*/



//}
