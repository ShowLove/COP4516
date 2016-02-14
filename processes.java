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


	            while (input.hasNextLine()) 
	            {
	                String line = input.nextLine();
	                String[] values = line.split(" ");
	                for(int i = 0; i < values.length; i++)
	                {
	                	if(values[i].equals("#"))
	                		break;
	                	System.out.print(" S"+values[i]+"E ");
	                }
	                System.out.println();
	                //System.out.print(line);
	                System.out.println();	      
	            }
	            input.close();

	        } 
	        catch (Exception ex) 
	        {
	            ex.printStackTrace();
	        }

		}
	}
