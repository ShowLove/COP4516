	import java.util.Arrays;
	import java.io.*;
	import java.util.*;

	public class processes
	{
		public static int[][] arivalBurst;

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

	            int processCount = 0;
	            int numProcess = 0;
	            int runFor = 0;
	            String use = new String("");
	            String numProcessStr = new String("");
	            char numChar = 'x';
	            int arrival = 'A';
	            int burst = 'B';
	            //String str = new String("SOME")
	            int quantum = 0;


		        while (input.hasNextLine()) 
		        {
		            String line = input.nextLine();
		            String[] values = line.split(" ");
		            for(int i = 0; i < values.length; i++)
		            {
		            	if(values[i].equals("#"))
		            		break;
		            	if(values[i].equals("processcount"))
		            	{
		              		//if x is process number
		            		//x,0--> Arrival //x,1--> burst
		            		processCount = Integer.parseInt( values[i+1] );		            		
		            		arivalBurst = new int[processCount+1][2];
		            	}
		            	if(values[i].equals("runfor"))
		            		runFor = Integer.parseInt( values[i+1] );
						if(values[i].equals("use"))
						{	
		            		use = values[i+1];
						}
		            	if(values[i].equals("quantum"))
		            		quantum = Integer.parseInt( values[i+1] );
		            	if(values[i].equals("name"))
		            	{
		            		//get process number as int
		            		/*numProcessStr = values[i+1];
		            		numChar = numProcessStr.charAt(1);
		            		processCount = Character.getNumericValue(numChar);*/

		            		//Number of Process element
		            		processCount = Character.getNumericValue( values[i+1].charAt(1) );
		            		//Arrival
		            		arrival = Character.getNumericValue( values[i+3].charAt(0) );
		            		//burst
		            		burst = Character.getNumericValue( values[i+5].charAt(0) );

		            		arivalBurst[processCount][0] = arrival;
		            		arivalBurst[processCount][1] = burst;           		
		            	}	                		               			               
		            }
		  
		        } //End of while loop

	            System.out.println("p_"+processCount+" r_"+runFor+" u_"+use+" q_"+quantum+" proCount_"+processCount);
	            System.out.println(" arrival_"+arrival+" burst_"+burst);

	            System.out.println(Arrays.deepToString(arivalBurst));
	            input.close();
	            //process information here

	        } 
	        catch (Exception ex) 
	        {
	            ex.printStackTrace();
	        }

		}
	}
