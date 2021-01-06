/**
 * Find the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
 * @author Rupsi
*/
import java.util.*;
public class Difference {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.println("Enter any number: ");
		num=sc.nextInt();
	    int sum =calculateDifference(num);
	    System.out.println("the difference between the sum of the squares and the square "
	    		+ "of the sum of the first "+num+" natural numbers is "+sum);
		}
	static int calculateDifference(int num)
	{
		int sum1=0,sum2=0;
		for(int i=1;i<=num;i++)
		{
			sum1+=i*i;
			sum2+=i;
			
		}
		sum2*=sum2;
		int diff=sum1-sum2;
		return diff;
	}

}
