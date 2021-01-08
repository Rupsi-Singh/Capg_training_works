/**
 *Create a method which accepts an integer array, 
 *reverse the numbers in the array and returns the resulting array in sorted order
 * @author Rupsi
 */
package com.cg.lab2.util;
import java.util.*;

public class ReversedArray {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int size;
	 System.out.println("Enter the length of the array: ");
	 size=sc.nextInt();
	 int arr[]=new int[size];
	 System.out.println("Enter the elements of the array: ");
	 for(int i=0;i<size;i++)
	 {
		arr[i]=sc.nextInt(); 
	 }
	 System.out.println("-------Original Array---------");
	 for(int i=0;i<size;i++)
	 {
		System.out.println(arr[i]+" ");
	 }
	 System.out.println("------Changed Array-----");
	 int a[]=new int[size];
	 a=getSorted(arr);
	 for(int i=0;i<size;i++)
	 {
		 System.out.print(a[i]+" ");
	 }
	}
	
	static int[] getSorted(int arr[])
	{
		int temp[]=new int[arr.length];
		int j=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			temp[i]=arr[j];
			j--;
		}
		Arrays.sort(temp);
		
		return temp;
	}

}

