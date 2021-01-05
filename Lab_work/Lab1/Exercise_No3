/**
 * Write a Java program that uses both recursive and non-recursive functions to print the nth value of the Fibonacci sequence?
 * @author Rupsi
 *
*/

import java.util.Scanner;
class Fibonacci
{
	int nonRecFibonacci(int n)
	{
		int a = 1, b = 1, c=0;
		if(n == 1)
		return 1;
		else if(n == 2)
		return 1;
		else
		{
			for(int i = 3; i <= n; i++)
			{
				c = a+b;
				a = b;
				b = c;
			}
			return c;
		}
	}
	int recFibonacci(int n)
	{
		if(n == 1)
		return 1;
		else if(n == 2)
		return 1;
		else
		{
			return recFibonacci(n-1)+recFibonacci(n-2);
		}
	}
}
class Fib
{
	public static void main(String[] args)
	{
		Fibonacci f = new Fibonacci();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = s.nextInt();
		System.out.println("Using non recursive method: "+f.nonRecFibonacci(n));
		System.out.println("Using recursive method: "+f.recFibonacci(n));
	}
}
