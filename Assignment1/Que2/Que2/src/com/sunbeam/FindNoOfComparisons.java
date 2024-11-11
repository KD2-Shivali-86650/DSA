package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class FindNoOfComparisons {

	private static int binarySearch(int[] arr, int key) {
		
		int left=0,right=arr.length-1;
		int mid=0,comp=0;
		while(left<=right)
		{
			comp++;
			mid=(left+right)/2;
			if(key==arr[mid])
			{
				System.out.println("No.of Comparisons done in Binary Search-"+comp);
				return mid;
			}
			else if(key<arr[mid])
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		//System.out.println("No.of Comparisons-"+comp);
		return -1;
	}

	private static int linearSearch(int[] arr, int key) {
		
		int comp=0;
		for(int i=0; i<arr.length-1; i++)
		{
			comp++;
			if(key==arr[i])
			{
				System.out.println("No of Comparisons Done for Linear Search="+comp);
				return i;
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
		
		int index=linearSearch(arr,num);
		
		if(index==-1)
		{
			System.out.println("Element not Found in linear Search");
		}
		else
		{
		System.out.println("Element fount at index="+index);
		}
		
		
		int index2=binarySearch(arr,num);
	
		if(index2==-1)
		{
			System.out.println("Element not Found in Binary Search");
		}
		else
		{
			System.out.println("Element found at index="+index);
		}
				
		}

	
}