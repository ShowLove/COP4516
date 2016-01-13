//package bruteforce;
import java.util.Arrays;

public class runOdometer {

	public static void main( String args[] )
	{
		int[] meter = new int[4];
		printOdometer(meter, 0, 4);
		System.out.println();
	}
	
	//Prints all possible settings of odometer with n digits withe the first k fixed
	public static void printOdometer(int[] odometer, int k, int n)
	{
		//base case
		if( k == n )
		{
			System.out.println(Arrays.toString(odometer));
		}

		//fill in each possible digit in slot k and recurse.
		else
		{
			for(int i = 0; i < 10; i++)
			{
				odometer[k]  = i;
				printOdometer(odometer, k+1, n);
			}

		}
	}

}