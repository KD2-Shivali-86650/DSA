import java.util.Arrays;
import java.util.Scanner;

public class LastOccurance {
	
	public static int lastOccurance(int arr[], int key) {
		for(int i = arr.length-1; i>=0; i--)
			if(key == arr[i])
				return i;
	
	
				return -1;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[]= {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		
		
		System.out.println("Array-" +Arrays.toString(arr));
		System.out.println("Enter A valid number from given array-");
		int key = sc.nextInt();
		
		
		int index = lastOccurance(arr,key);
		if(index == -1)
			System.out.println("Index not found");
		else
			System.out.println("Last Occurance of Element at index is-" +index);
		

	}

}
