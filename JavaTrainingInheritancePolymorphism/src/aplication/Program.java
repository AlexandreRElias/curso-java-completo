package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> listEmployee = new ArrayList<>();
		
		System.out.print("Enter the number of the employees: ");
		int nEmployees = sc.nextInt();
		
		for(int i = 0; i < nEmployees; i++) {
			
			System.out.println("Employee #" + (i+1) + " data");
			System.out.print("Outsourced (y/n)? : ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				listEmployee.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else{
				listEmployee.add(new Employee(name, hours, valuePerHour));
			}
		}
			System.out.println();			
			System.out.println("PAYMENTS:");
			
			for(Employee emp : listEmployee) {
				System.out.println(emp.getName() + "- $ " + String.format("%.2f", emp.payment()));
			
     		}
			sc.close();
	     }
}
		
