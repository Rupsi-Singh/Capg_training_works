/**
 * Create a class with a method which can calculate the sum of first n natural numbers which are divisible by 3 or 5
 * @author Rupsi
*/


import java.util.*;
public class SumOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int sum=calculateSum(n);
		System.out.println("Sum of first "+n+" natural numbers are "+sum);
	}
		
static int calculateSum(int n)
{
	int s3=0,sum3=0,sum5=0,sum=0;
	for(int i=1;i<=n;i++)
		{
			if(i%3==0)
				sum3+=i;
			else if(i%5==0)
				sum5+=i;
		}
     for(int i=1;i<=n;i++)
     {
    	 if((i%3==0)&&(i%5==0))
    		 s3+=i;
     }
     sum=sum3+sum5-s3;
     return sum;
	
}
}
