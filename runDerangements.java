//package bruteforce;
import java.util.Arrays;

public class runDerangements {
	
	public static void main( String args[] )
	{
	    int[] perm = new int[5];
	    boolean[] used = new boolean[5];
	    printDerangements(perm, used, 0, 5);
	    System.out.println();
	}

	// Prints out all derangements in perm with the first k digits fixed.
	public static void printDerangements(int perm[], boolean used[], int k, int n) {

	   // Base case.
	    if (k == n) 
	    	System.out.println(Arrays.toString(perm));

	    // Recursive case - fill in slot k.
	    else {
	        int i;

	        // Same as permutation, but we don't allow slot k to be filled with k.
	        for (i=0; i<n; i++) {
	            if (used[i] == false && i != k) {
	                used[i] = true;
	                perm[k] = i;
	                printDerangements(perm, used, k+1, n);
	                used[i] = false;
	            }
	        }
	    }
	}

}
