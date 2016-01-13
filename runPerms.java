//package bruteforce;
import java.util.Arrays;


public class runPerms {
	
	public static void main( String args[] )
	{
		int[] perm = new int[4];
		boolean[] used = new boolean[4];

		printPerms(perm, used, 0, 4);
		System.out.println();
	}

	// Prints all permutations of 0,1,...,n-1 where the first k items of perm are fixed.
	public static void printPerms(int[] perm, boolean[] used, int k, int n) 
	{
	    // Base case.
	    if (k == n) 
	    	System.out.println(Arrays.toString(perm));

	    // Recursive case - fill in slot k.
	    else 
	    {
	        // Only fill slot k with items that have yet to be used. If i hasn't been used,
	        // put it in slot k and recursively print all permutations with these k+1 starting items.
	        for (int i=0; i<n; i++) 
	        {
	            if (used[i] == false) 
	            {
	                used[i] = true;
	                perm[k] = i;
	                printPerms(perm, used, k+1, n);
	                used[i] = false;
	            }
	        }
	    }
	}

}
