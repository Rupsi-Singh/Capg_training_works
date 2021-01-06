/**
 * Create a method to find the sum of the cubes of the digits of an n digit number
 * @author Rupsi
 *
*/
import java.util.*;
public class SumOfCubes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number of your choice: ");
		int num=sc.nextInt();
		int ans=sum1(num);
		System.out.println(ans);
	}
	static int sum1(int num)
	{
		int sum=0,rem;
		while(num>0)
		{
			rem=num%10;
			sum+=rem*rem*rem;
			num/=10;
		}
		return sum;
	}
	

}
