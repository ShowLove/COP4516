import java.util.Arrays;

public class practice2
{
	public static void main( String args[] )
	{
		boolean[] used = new boolean[5];
		int[] perm = new int[5];
		int k = 0, n = 5;
		runPerm(used, perm, k, n);

	}

	public static void runPerm(boolean[] used,int[] perm,int k,int n)
	{
		if( n == k )
			System.out.println(Arrays.toString(perm) );
		else
		{
			for( int i = 0; i < n; i++ )
			{
				if( used[i] == false )
				{
					used[i] = true;
					perm[k] = i;
					runPerm(used, perm, k+1, n);
					used[i] = false;
				}
			}
		}

	}
}