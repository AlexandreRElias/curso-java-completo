package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.BusinesEntity;
import entities.NaturalPerson;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of TaxPayer: ");
		int taxpayerNumber = sc.nextInt();
		sc.nextLine();

		List<TaxPayer> listTaxpayer = new ArrayList<>();

		for (int i = 0; i < taxpayerNumber; i++) {
			System.out.println("TaxPayer #" + (i + 1));
			System.out.print("Natural Person/Business Entity (n/b)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Annual Income: $ ");
			Double annualIncome = sc.nextDouble();
			sc.nextLine();

			if (type == 'n') {
				System.out.print("Medical Expenses: $ ");
				Double medicalExpenses = sc.nextDouble();
				sc.nextLine();
				listTaxpayer.add(new NaturalPerson(name, annualIncome, medicalExpenses));
			} else {
				if (type == 'b') {
					System.out.print("Employee Count: ");
					int employeeCount = sc.nextInt();
					listTaxpayer.add(new BusinesEntity(name, annualIncome, employeeCount));
				}
			}
		}

		System.out.println();
		System.out.println("TAX PAYAMENTS:");
		Double sum = 0.0;
		for (TaxPayer payer : listTaxpayer) {
			sum += payer.taxCalculation();
			System.out.println(
					"Name: " + payer.getName() + ": $ " + String.format("%.2f", payer.taxCalculation()));
		}
		 System.out.println("TOTAL TAX PAYAMENTS: $ " + String.format("%.2f", sum)); 
		sc.close();
	}
}
