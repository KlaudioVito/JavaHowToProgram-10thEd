package ch03;

import java.util.Scanner;

public class Ex3_13Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex3_13 employee1 = new Ex3_13("John", "Blue", 2500.00);
		Ex3_13 employee2 = new Ex3_13("Jane", "Green", 2350.00);
		
		printEmployee(employee1);
		printEmployee(employee2);
		
		Scanner input = new Scanner(System.in);
		System.out.print("\nSet employee1 first name: ");
		String firstName = input.next();
		employee1.setFirstName(firstName);
		
		System.out.print("Set employee1 last name: ");
		String lastName = input.next();
		employee1.setLastName(lastName);
		
		System.out.print("Set employee1 salary: $");
		double monthlySalary = input.nextDouble();
		employee1.setSalary(monthlySalary);
		
		printEmployee(employee1);
		
		System.out.print("\nSet employee2 first name: ");
		firstName = input.next();
		employee2.setFirstName(firstName);
		
		System.out.print("Set employee2 last name: ");
		lastName = input.next();
		employee2.setLastName(lastName);
		
		System.out.print("Set employee2 salary: $");
		monthlySalary = input.nextDouble();
		employee2.setSalary(monthlySalary);
		
		printEmployee(employee2);
		
		System.out.printf("%nEmployee1 yearly salary: $%.2f", 12*employee1.getSalary());
		System.out.printf("%nEmployee2 yearly salary: $%.2f", 12*employee2.getSalary());
		
		employee1.setSalary(employee1.getSalary() + employee1.getSalary()*0.1);
		employee2.setSalary(employee2.getSalary() + employee2.getSalary()*0.1);
		System.out.printf("%n%nEmployee1 yearly salary with 10%% raise: $%.2f", 12*employee1.getSalary());
		System.out.printf("%nEmployee2 yearly salary with 10%% raise: $%.2f%n", 12*employee2.getSalary());
		
		printEmployee(employee1);
		printEmployee(employee2);
		
		input.close();
	}
	private static void printEmployee(Ex3_13 employee){
		System.out.println("\nEmployee: " + employee.getFirstName() + " " + employee.getLastName());
		System.out.printf("Salary: $%.2f/month%n",employee.getSalary());
	}
}
