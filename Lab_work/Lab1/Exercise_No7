/**
 * Check if a number is an increasing number 
 * @author Rupsi
*/
import java.util.*;
public class IncreasingNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		boolean ans= checkNumber(num);
		if(ans==true)
			System.out.println(num+" is an increasing number.");
		else
			System.out.println(num+" is not an increasing number");
		}
	static boolean checkNumber(int num)
	{
		int last=10;
		while(num>0)
		{
			int current=num%10;
			if(last<current)
				return false;
			last=current;
			num=num/10;
		}
		return true;
	}

}
