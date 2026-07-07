package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: $ ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: $ ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
				
		System.out.printf("Employee: %s, $ %.2f%n", employee.name,employee.netSalary());
		
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println();
		
		System.out.printf("Updated data: %s, $ %.2f%n", employee.name,employee.netSalary());
		
		
		
		//System.out.printf("Gross salary: %.2f%n", funcionario.grossSalary);
		//System.out.printf("Tax: %.2f%n", funcionario.tax);
				
		sc.close();

	}

}
