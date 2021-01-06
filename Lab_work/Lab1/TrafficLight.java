/**
 * Program to simulate the traffic light according to the users's choice
 * @author Rupsi
 *
*/
import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice: ");
		String choice= sc.nextLine();
		System.out.println(fun(choice));
	}
	 static String fun(String choice)
	{
		switch(choice)
		{
			case "red":
				return "Stop!!";
			    
		    case "yellow": 
		    	return "Ready!!";
		         
		    case "green":
		    	return "Go!!";
		    	
		    default:
		    	return "Wrong choice!!";
		}
	}
 }
