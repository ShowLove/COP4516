import java.util.Arrays;

//Finds all string permutations
public class allStrPerms
{
	public static void main( String args[] )
	{
		String str = "hello";
		permutation(str);
	}

	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
}