package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int arr[]= {90,40,30,20,10};
				
		
		
//		int arr[]=new int[5];
//		
//		System.out.println("Enter Five elements");
//		for(int i=0; i<5;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
		System.out.println("Array="+Arrays.toString(arr));
		
		boolean isDesc=checkDescending(arr,arr.length);
		
		if(isDesc)
		{
			System.out.println("Array is in Descending order");
			System.out.println("Enter Element to search- ");
			int key=sc.nextInt();
			int index=binarySerch(arr,key);
			if(index==-1)
			{
				System.out.println("Element Not Found");
			}
			else
			{
				System.out.println("Element found at index= "+index);
			}
		}
		
		else
		{
			System.out.println("Array is not in Descending Order");
		}
	
	
		
	}

	private static boolean checkDescending(int[] arr, int length) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=0; i<length-1; i++)
		{
			for(int j=i+1; j<length;j++)
			{	
				if(arr[i]>arr[j])
				{
					flag=1;
					//System.out.println(arr[i]+" "+arr[j]);
					continue;
				}
				else
				{
					flag=0;
					break;
				}
				
			}
			if(flag==0)
			{
				break;
			}
		}
		if(flag==1)
		{
			return true;
		}
		return false;
	}
	
	private static int binarySerch(int[] arr, int key) {
		// TODO Auto-generated method stub
		int left=0,right=arr.length-1,mid=0;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		
		return -1;
	}

}