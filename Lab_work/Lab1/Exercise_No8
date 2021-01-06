/**
 * Check if the entered number is a power of two or not  
 * @author Rupsi
*/
import java.util.*;
public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		boolean ans=checkNumber(num);
		if(ans)
			System.out.println(num+" is power of 2");
		else
			System.out.println(num+" is not power of 2");
		}
	static boolean checkNumber(int n)
	{
		if(n==0)
		 return false; 
        while(n != 1)
        {
            n = n/2;
            if(n%2 != 0 && n != 1)
             return false;
        }
        return true;
	}
}
