package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Register {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee;
		List<Employee> listEmployee = new ArrayList<>();
		
		System.out.print("How many employers will be registered? ");
		Integer employeeNumber = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < employeeNumber; i++) {
			
			System.out.println("Employee #" + (i+1) + ":");
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			
			employee = new Employee(id, name, salary);
			
			listEmployee.add(employee);	
		}
		
		System.out.println();
		System.out.print("Enter the employer id that will have salary increase: ");
		int idIncreaseSalary = sc.nextInt();
		sc.nextLine();
		
		Integer pos = position(listEmployee, idIncreaseSalary);
		
		//Employee emp = listEmployee.stream().filter(x -> x.getId() == idIncreaseSalary).findFirst().orElse(null);
		
		
		if(pos == null) {	
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentIncreaseSalary = sc.nextDouble();		
			listEmployee.get(pos).increaseSalary(percentIncreaseSalary);
		}	
		System.out.println();
		System.out.println("List of employees:");
		for(Employee employe : listEmployee) {
			System.out.println(employe);
		}
		
		sc.close();
	}
	
	public static Integer position(List<Employee> list, int id) {
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
