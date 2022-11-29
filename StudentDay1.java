package day1;

import java.util.Scanner;

public class StudentDay1 {

	
	String firstName, lastName;
	int mark1, mark2, mark3, mark4, total;
	float average;
	
	public int totalCalculation(String firstName, String lastName, int mark1, int mark2, int mark3, int mark4)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
		this.mark4=mark4;
		total = mark1 + mark2 + mark3 + mark4;
		return total;
	}
	
	public float averageCalculation()
	{
		average = total / 4;
		return average;
	}
	
	public void displayStudentDetails()
	{
		System.out.println("First Name        :"+firstName);
		System.out.println("Last Name         :"+lastName);
		System.out.println("Mark1             :"+mark1);
		System.out.println("Mark2             :"+mark2);
		System.out.println("Mark3             :"+mark3);
		System.out.println("Mark4             :"+mark4);
		System.out.println("Total             :"+total);	
		System.out.println("Average           :"+average);
		System.out.println();
	}
	
	

	public static void main(String[] args) {
			
			// Student 1
			StudentDay1 s1= new StudentDay1();
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Student FirstName");
			String firstName = sc.next();
			
			System.out.println("Enter Student lastName");
			String lastName = sc.next();
			
			System.out.println("Enter Mark1");
			int mark1 = sc.nextInt();
			
			System.out.println("Enter Mark2");
			int  mark2 = sc.nextInt();
			
			System.out.println("Enter Mark3");
			int mark3 = sc.nextInt();
			
			System.out.println("Enter Mark4");
			int mark4 = sc.nextInt();
		
			s1.totalCalculation(firstName, lastName, mark1, mark2, mark3, mark4);
			s1.averageCalculation();
			s1.displayStudentDetails();
			
			// Student 2
			StudentDay1 s2= new StudentDay1();
			
			System.out.println("Enter Student FirstName");
			String firstName2 = sc.next();
			
			System.out.println("Enter Student lastName");
			String lastName2 = sc.next();
			
			System.out.println("Enter Mark1");
			int mark21 = sc.nextInt();
			
			System.out.println("Enter Mark2");
			int  mark22 = sc.nextInt();
			
			System.out.println("Enter Mark3");
			int mark23 = sc.nextInt();
			
			System.out.println("Enter Mark4");
			int mark24 = sc.nextInt();
		
			s2.totalCalculation(firstName2, lastName2, mark21, mark22, mark23, mark24);
			s2.averageCalculation();
			s2.displayStudentDetails();
			
			// Student 3
			StudentDay1 s3= new StudentDay1();
			
			System.out.println("Enter Student FirstName");
			String firstName3 = sc.next();
			
			System.out.println("Enter Student lastName");
			String lastName3 = sc.next();
			
			System.out.println("Enter Mark1");
			int mark31 = sc.nextInt();
			
			System.out.println("Enter Mark2");
			int  mark32 = sc.nextInt();
			
			System.out.println("Enter Mark3");
			int mark33 = sc.nextInt();
			
			System.out.println("Enter Mark4");
			int mark34 = sc.nextInt();
		
			s3.totalCalculation(firstName3, lastName3, mark31, mark32, mark33, mark34);
			s3.averageCalculation();
			s3.displayStudentDetails();
			
			// Student 4
			StudentDay1 s4= new StudentDay1();
			
			System.out.println("Enter Student FirstName");
			String firstName4 = sc.next();
			
			System.out.println("Enter Student lastName");
			String lastName4 = sc.next();
			
			System.out.println("Enter Mark1");
			int mark41 = sc.nextInt();
			
			System.out.println("Enter Mark2");
			int  mark42 = sc.nextInt();
			
			System.out.println("Enter Mark3");
			int mark43 = sc.nextInt();
			
			System.out.println("Enter Mark4");
			int mark44 = sc.nextInt();
		
			s4.totalCalculation(firstName4, lastName4, mark41, mark42, mark43, mark44);
			s4.averageCalculation();
			s4.displayStudentDetails();
	
		}
	}

