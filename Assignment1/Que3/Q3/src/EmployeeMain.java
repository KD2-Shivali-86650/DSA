

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		Employee arr[]=new Employee[5];
		arr[0]=new Employee(1,"Anil");
		arr[1]=new Employee(2,"sunil");
		arr[2]=new Employee(3,"mukesh");
		arr[3]=new Employee(4,"nita");
		arr[4]=new Employee(5,"sham");
		
		System.out.println("****Employee List****");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i].toString() );
		}
		do {
			System.out.println("0.Exit\n1.Search Employee by Id\n2.Search Emploee by name");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter Employee id to search");
				int id=sc.nextInt();
				
				Employee e1=SearchById(arr,new Employee(id));
				
				break;
			case 2:
				System.out.println("Enter Employee name to search");
				String name=sc.next();
				
				Employee e2=SearchByName(arr,new Employee(name));
				
				break;
			case 0:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Choice");
				break;
			}
			
		}while(choice!=0);
		
		
	}

	private static Employee SearchByName(Employee[] arr, Employee employee) {
		for(int i=0; i<arr.length-1; i++)
		{
			if(employee.name.equalsIgnoreCase(arr[i].name) )
			{
				System.out.println("Employee found at index= "+i);
				return arr[i];
			}
			
		}
		System.out.println("Employee Not Found");
		return null;
		
	}

	private static Employee SearchById(Employee[] arr, Employee employee) {
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length-1; i++)
		{
			if(employee.empId==arr[i].empId)
			{
				System.out.println("Employee found at index= "+i);
				return arr[i];
			}
			
		}
		System.out.println("Employee Not Found");
		return null;
	}

}