import java.util.Arrays;
import java.io.*;
import java.util.*;

public class movie
{
	public static void main( String args[] )
	{
		movie();
	}

	public static void movie()
	{
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();	//Number of test cases

		int numTickets = 0, numSlices = 0;
		int totalCost = 0;

		for(int i = 0; i < N; i++)
		{
			numTickets = sc.nextInt();
			numSlices = sc.nextInt();

			//find the price
			if( numTickets > 10 )
				totalCost = numTickets*10 + numSlices;
			else
				totalCost = numTickets*10 + numSlices*2;

			System.out.printf("%d\n", totalCost );

		}

	}
}