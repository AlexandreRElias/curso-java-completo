package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Exercicio1 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Account account;

		System.out.print("Enter account number: ");
		int Number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String Holder = sc.nextLine();

		System.out.print("Is there a inicial deposit? (y or n): ");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter initial deposit value: $");
			double initialDeposit = sc.nextDouble();
			account = new Account(Number, Holder, initialDeposit);
		} else {
			account = new Account(Number, Holder);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: $ ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updating account data:");
		System.out.println(account);
		System.out.println();
		System.out.print("Enter a withdraw value: $ ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updating account data:");
		System.out.println(account);

		sc.close();
	}
}
