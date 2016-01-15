import java.io.*;
import java.util.*;

public class nCr {

    public static void main(final String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("1:nCr,2:all_nCr");
        int Choice = sc.nextInt();

        if( Choice == 1 )
        {
            int N = sc.nextInt();   //Number of test cases
            int R = sc.nextInt();   //Choose these
            print_nCr(N, R);
        }
        else if( Choice == 2 )
        {   
            int N = sc.nextInt();   //Number of test cases
            print_All_nCr(N);
        }

    }

    public static void print_All_nCr(int N)
    {
        for(int R = 1; R <= N; R++)
        {
            print_nCr(N,R);
        }
    }

    public static final void print_nCr(final int n, final int r) {
        int[] res = new int[r];
        for (int i = 0; i < res.length; i++) {
            res[i] = i + 1;
        }
        boolean done = false;
        while (!done) {
            System.out.println(Arrays.toString(res));
            done = getNext(res, n, r);
        }
    }

    /////////

    public static final boolean getNext(final int[] num, final int n, final int r) {
        int target = r - 1;
        num[target]++;
        if (num[target] > ((n - (r - target)) + 1)) {
            // Carry the One
            while (num[target] > ((n - (r - target)))) {
                target--;
                if (target < 0) {
                    break;
                }
            }
            if (target < 0) {
                return true;
            }
            num[target]++;
            for (int i = target + 1; i < num.length; i++) {
                num[i] = num[i - 1] + 1;
            }
        }
        return false;
    }
}