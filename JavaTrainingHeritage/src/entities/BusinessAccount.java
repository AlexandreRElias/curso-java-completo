package entities;

public class BusinessAccount extends Account{
	
	private Double loanLimit;	
	
	public BusinessAccount() {
		super();
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		//deposit(amount);
	}else {
		System.out.println("Valor de limite insuficiente");
		}

	}
}
