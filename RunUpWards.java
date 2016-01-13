package bruteforce;
import java.util.Arrays;

public class RunUpWards {
	
	public static void main( String args[] )
	{
	    char[] word = new char[6];
	    word[5] = '\0';
	    printUpWards(word, 2, 0, 5);
	    System.out.println();	
	}

	// Prints all skip-level upwords of length n.
	public static void printUpWards(char word[], int skip, int k, int n) {

	    // Base case - word is filled in.
	    if (k == n) 
	    	System.out.println(Arrays.toString(word));

	    // Try each possible item in slot k.
	    else {

	        // If we haven't filled anything yet, we start with 'a', otherwise go to the last character and
	        // count forward skip+1 places.
			byte start = (byte)(k == 0 ? 'a' : word[k - 1] + skip + 1);
			for(byte next = start; next <= 'z'; next++) 
			{
				word[k] = (char) next;
				printUpWards(word, skip, k + 1, n);
			}


	    }
	}

}
