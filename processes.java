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

	            int processCount = 0;
	            int runFor = 0;
	            String use = new String("");
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
	                		processCount = Integer.parseInt( values[i+1] );
	                	if(values[i].equals("runfor"))
	                		runFor = Integer.parseInt( values[i+1] );
						if(values[i].equals("use"))
						{	
	                		use = values[i+1];
						}
	                	if(values[i].equals("quantum"))
	                		quantum = Integer.parseInt( values[i+1] );                			               
	                	//System.out.print(" S"+values[i]+"E ");
	                }
	      
	            }
	            System.out.println("p_"+processCount+" r_"+runFor+" u_"+use+" q_"+quantum);
	            input.close();

	        } 
	        catch (Exception ex) 
	        {
	            ex.printStackTrace();
	        }

		}
	}
