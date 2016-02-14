import java.util.Arrays;
import java.io.*;
import java.util.*;

public class processes
{
	public static void main( String args[] )
	{
		processes();
	}

	public static void processes()
	{
       try 
       {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the file name with extention : ");
            File file = new File(input.nextLine());

            input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                System.out.println(line);
            }
            input.close();

        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
// 		System.out.println(N+","+X);

	}
}
