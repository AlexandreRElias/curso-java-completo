package entities;

public class SavingsAccount extends Account {

	private Double InterestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount( Integer number, String holder, double balance, Double interestRate) {
		super(number, holder, balance);
		this.InterestRate = interestRate;
	}

	public Double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(Double interestRate) {
		InterestRate = interestRate;
	}
	
	public void updateBalance(Double interestRate) {
		balance += balance * interestRate;
	}
	
	
	
}
