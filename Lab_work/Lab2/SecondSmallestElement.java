/**
 * Program to find the second smallest element of an array
 * @author Rupsi
*/
import java.util.*;
public class SecondSmallestElement {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Elements of the array are: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int small=smallest(arr);
	    System.out.println("The second smallest element of the array is "+small);
	}
	static int smallest(int arr[])
	{	
		int n=arr.length;
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			}
		return arr[1];	}	

}

