import java.util.Arrays;
import java.util.Scanner;

public class Linearsearch {
	
	public static int linearSearch(int arr[], int key) {
	
		
		int comp =0;
		for(int i=0; i<arr.length; i++) {
			comp++;
			
			if(key == arr[i])
			{
				System.out.println("Comparisions-" +comp);
				return i;
				
			}
			}
		
		
		return -1;
		
		}	

	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[]= {88, 33, 66, 99, 11, 77, 22, 55, 14};
		System.out.println("Array before sort-" +Arrays.toString(arr));
		
		
		System.out.println("Enter Element-");
		int key = sc.nextInt();
		
		int index = linearSearch(arr, key);
		if(index == -1) 
			System.out.println("Key is not found");
		else
			System.out.println("key found at index-" +index);
		
		
	}

}
