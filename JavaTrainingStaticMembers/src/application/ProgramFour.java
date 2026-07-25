package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramFour {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("What is the dollar price?");
		System.out.print("$ ");
		double dollarPrice;

		dollarPrice = sc.nextDouble();

		System.out.println("How many dollars will be bought?");
		System.out.print("$ ");

		double dollarAmount = sc.nextDouble();

		double reaisAmount = CurrencyConverter.converter(dollarPrice, dollarAmount);

		System.out.printf("Amount to be paid in reais = %.2f", reaisAmount);

		sc.close();
	}

}
