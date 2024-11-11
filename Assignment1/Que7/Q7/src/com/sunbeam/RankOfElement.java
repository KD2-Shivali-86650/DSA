package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class RankOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int arr[]= {10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Array= "+Arrays.toString(arr));
			
		System.out.println("Enter element to find it's Rank-");
		int ele=sc.nextInt();
		
		int num=findRank(arr,arr.length,ele);
		
		System.out.println("Rank of "+ele+" is "+num);
		}

	private static int findRank(int[] arr, int length,int key) {
		// TODO Auto-generated method stub
		int count=1;
		for(int i=0; i<length-1; i++)
		{
			if(key==arr[i])
			{
				count++;
			}
			if(key>arr[i])
			{
				count++;
			}
		}
		
		return count;
	}
	}

