package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramUpcastingDowncasting {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(100, "Maria", 0.0, 500.0);
		
		System.out.println("Balance: " + acc.getBalance());
		
		//UPCASTING
		
		Account acc1 = bacc;
		acc1.getBalance(); //The businessAccount is a Account
		
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		
		//DOWNCASTING Warning: downcast might fail at runtime, and the compiler won't detect it.
		
		BusinessAccount acc4 = (BusinessAccount)acc2;   //forced casting
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; 
													  /*
		                                               * This is not permitted because acc3 is not a BusinessAccount.
		                                               * This causes a ClassCastException at runtime:
		                                               * "Exception in thread 'main' java.lang.ClassCastException: 
	                                                   * class entities.SavingsAccount cannot be cast to class entities.BusinessAccount"
		                                               * Location: at applications.ProgramUpcastingDowncasting.main(ProgramUpcastingDowncasting.java:29)
		                                               */
		//then...
		
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Updating");
		}
		
	}
}
