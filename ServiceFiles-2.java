/*Dashawn Smith
 * April 24,2017
 * 
 */
import java.io.*;
import java.security.Provider.Service;
import java.util.*;

public class ServiceFiles 
{
	public static void main(String[] args)
	{
	    //Initialize all variables  
		Scanner in = new Scanner(System.in);
	    String filename1 = "", filename2 ="" ;
        double dinner = 0.0, conf = 0.0, lodging = 0.0, total= 0.0;
        
        //Prompt the user for the filename
        System.out.println("Please enter input file name: ");
        filename1 = in.next();

	
	    try
	    {
	    	//open each of the files for reading and writing
	    	//You can name each output file for the services listed above
	    	Scanner infile = new Scanner(new File(filename1));
	    	 PrintWriter dinners = new PrintWriter("dinner.txt");
	    	 PrintWriter lodge = new PrintWriter("Lodging.txt");
	    	 PrintWriter conference = new PrintWriter("conference.txt");

	        String str = "", name = "", service = "", date = "";
	        //Finish the while loop to read in while there is information
	         
	         
	        while (infile.hasNextLine())
	        {
	        	//Read in all but the date from the input file
	        	//the file name is services.txt
	        	str = infile.nextLine();
	        	Scanner lineScanner = new Scanner(str);
	        	lineScanner.useDelimiter(" , ");
	        	name = lineScanner.next();
	        	service = lineScanner.next();
	            
	            if (service.equals("Dinner"))
	            {
	                //Write information to output
	            	//Add the expense to the total
	             dinner += Double.parseDouble(lineScanner.next());

	            }
	            else if (service.equals("Lodging"))
	            {
	                //Write information to output
	            	//Add the expense to the total 
		             lodging += Double.parseDouble(lineScanner.next());

	            }
	            else if (service.equals("Conference"))
	            {
	                //Write information to output
	            	//Add the expense to the total 
		             conf += Double.parseDouble(lineScanner.next());
	            }
	            else //leave this in for students
	            {
	               throw new NoSuchElementException();
	            }
	            //Read the date last from the input file
	            System.out.print("date?");
	            date = lineScanner.next();
	         }//end of while
	        
	        //Write expenses to each file, using formatted output
	        	dinners.printf("Dinner total",dinner);
	        	lodge.printf("Lodging total $%.2f", lodging);
	        	conference.printf("Conference total $%.2f", conf);
	        	dinners.close();
	        	lodge.close();
	        	conference.close();
	        //Close all files

	      }
	    //end of try statement
	      //catch the file error
	    	catch (FileNotFoundException e) 
	      {
	         System.out.println("File not found!");
	      }
	    catch (IllegalFormatException exception)
	    {
	         System.out.println("File format not valid.");
	      }

	}//main
} //class