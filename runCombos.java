//package bruteforce;
import java.util.Arrays;
import java.io.*;
import java.util.*;

public class runCombos {

	public static void main( String args[] )
	{
		System.out.println("N:");

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();   //Number of test cases
	    int[] items = new int[N];
	    printCombos(items, 0, N);
	    System.out.println();
	}

	public static void printCombos(int subset[], int k, int n) {

	    // Base case, subset filled in.
	    if (k == n) 
	    	printSubsets(subset, n);

	    // Recursive case - fill slot k.
	    else {

	        // First do subset without item k.
	        printCombos(subset, k+1, n);

	        // Now do the subset with item k. Must return subset to original setting!!!
	        subset[k] = 1;
	        printCombos(subset, k+1, n);
	        subset[k] = 0;
	    }
	}

	// Prints out the subset of 0,1,2..,n-1 represented by subset. subset[i] is 1 iff i is in the subset.
	public static void printSubsets(int subset[], int n) {
	    int i;
	    for (i=0; i<n; i++)
	        if (subset[i] == 1)
	            System.out.printf("%d ", i);
	    System.out.println();
	}
}
