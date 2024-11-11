package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class Find_nth_occurance {
	
	
	private static int linearSearch(int[] arr, int key,int occu) {
		
		int count=0;
		
		for(int i=0; i<arr.length-1; i++)
		{
			
			if(key==arr[i])
			{
				count++;
				//System.out.println("No of Comparisons Done for Linear Search="+comp);
				if(count==occu)
				{
				return i;
				}
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {20,10,30,59,35,20,90};
		System.out.println("Array="+Arrays.toString(arr));
		System.out.println("Enter element to find");
		int num=sc.nextInt();
		System.out.println("whice Occurance you want-");
		int occu=sc.nextInt();
		
		int index=linearSearch(arr,num,occu);
		
		if(index==-1)
		{
			System.out.println("Element not Found at "+occu+"th Occurance");
		}
		else
		{
		System.out.println(occu+"th occurance of element found at index "+index);
		}
	
	}

}