
package com.sunbeam;

import java.util.Arrays;

public class nonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		System.out.println("Array="+Arrays.toString(arr));
		nonRepeatingElement(arr,arr.length);
		
		
	}

	private static void nonRepeatingElement(int[] arr, int length) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<length-1; i++)
		{
			int flag=0;
			for(int j=i+1; j<length; j++)
			{
				if(arr[i]==arr[j])
				{
					//System.out.println(arr[i]+" "+arr[j]);
					flag=1;
				}
				
				
			}
			//System.out.println(arr[i]);
			if(flag==0)
			{
				System.out.println("first Non Repeating Element is= "+arr[i]);
				break;
			}
		
		}
		
		
	}

}