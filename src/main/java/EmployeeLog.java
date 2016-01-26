import java.util.Scanner;

/**
 * 
 */

/**
 * @author kvoitau
 *Create an Employee Entry Application which takes employee details such 
 *as Name, Address, Age, City, Phone Number, and Job Title. 
 *The number of employees that will be entered into the array should be determined 
 *at the start of the application. Upon exiting the employee details should be echoed to the user.
 */

public class EmployeeLog 
{
	static String[] strings = {"What", "a", "lovely", "day!"};
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		String input;
		String name[] = new String[3];
		String address[] = new String[3];
		String age[] = new String[3];
		String city[] = new String[3];
		String phoneNumber[] = new String[3];
		String jobTitle[] = new String[3];
		char[] array1 = {'1','2','3'};
		char[] array2 = new char[3];
		array2[2] = '5';
		
		int[] array4 = {1,2,3,4,5};
		print(strings);
		
		// start the employee application 
		String[] employees = new String[3];
		
		System.out.println("Welcome to Employee Log!\n");
		
		// for loop to store entered employee details
		// into array
		for (int i = 0; i < employees.length; i++)
		{
			System.out.print("What's the employee " + (i+1) + " name?: ");
			input = scanner.nextLine();
			name[i] = input;
			
			System.out.print("What's the employee " + (i+1) + " address?: ");
			input = scanner.nextLine();
			address[i] = input;
			
			System.out.print("What's the employee " + (i+1) + " age?: ");
			input = scanner.nextLine();
			age[i] = input;
			
			System.out.print("What's the employee " + (i+1) + " city?: ");
			input = scanner.nextLine();
			city[i] = input;
			
			System.out.print("What's the employee " + (i+1) + " phone number?: ");
			input = scanner.nextLine();
			phoneNumber[i] = input;
			
			System.out.print("What's the employee " + (i+1) + " job title?: ");
			input = scanner.nextLine();
			jobTitle[i] = input;
			
			System.out.println();
		}

		// print employee stored info method
		printEmployee(name, address, age, city, phoneNumber, jobTitle);
	}
	
	public static void print(String strings[])
	{
		for (String item : strings)
			System.out.print(item + " ");
		System.out.println("\n\n");
	}
	
	public static void printEmployee(String name[], String address[], 
			String age[], String city[], String phoneNumber[], String jobTitle[])
	{
		for (int i = 0; i < name.length; i++)
		{
			System.out.println("---------------Employee " + (i + 1) + "---------------------");
			System.out.println("Name: " + name[i]);	
			System.out.println("Address?: " + address[i]);		
			System.out.println("Age?: " + age[i]);	
			System.out.println("City?: " + city[i]);
			System.out.println("Phone number?: " + phoneNumber[i]);
			System.out.println("Job title?: " + jobTitle[i]);	
		}
	}

}


