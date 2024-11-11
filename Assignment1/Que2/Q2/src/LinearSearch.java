import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
		
		int arr[]= {20,10,30,59,35,20,90};
		System.out.println("Array="+Arrays.toString(arr));
		System.out.println("Enter element to find it's Last Ocuurace");
		int num=sc.nextInt();
		
		int index=linearSearch(arr,num);
		System.out.println("Last Occurance of Element at index="+index);
				
		}

	private static int linearSearch(int[] arr, int key) {
		
		for(int i=arr.length-1; i>=0; i--)
		{
			if(key==arr[i])
			{
				return i;
			}
		}
		return -1;
		
	}
	

	}


