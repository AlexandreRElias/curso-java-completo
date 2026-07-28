package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;


public class Program {
	
	public static void main(String[] args) {
		
		/*Account acc1 = new Account(1001, "Alex", 1000.00); dá erro porque a classe Account é abstrata nesse exemplo
		 *Account acc2 = new SavingsAccount(1002, "Maria", 1000.00, 0.01);
		 *Account acc3 = new BusinessAccount(1003, "Bob", 1000.00, 500.00);
		
		 *O intuito de deixar a classe Account abstrata é ela não poder ser instanciada.
		
		 *Mas usamos essa classe, mesmo abstrata para fazer uso de Reuso de código e do polimorfismo. 
		
		*Suponha que queremos:
		 *Totalizar o saldo de todas as contas.
		 *depositar 10.00 em todas as contas.
		 */
		
		Locale.setDefault(Locale.US);
		
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.00));
		list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.00, 500.00));
		
		double  sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sum);
		
		for (Account acc : list) {
			acc.deposit(10.00);
		}
		
		for (Account acc : list) {
			System.out.printf("Updating balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}

}
