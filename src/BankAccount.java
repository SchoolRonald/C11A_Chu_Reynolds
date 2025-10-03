


public class BankAccount {
	private double balance;
	
	BankAccount (double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double amount) throws NegativeBalanceException {
		
		if (amount > this.balance) {
			throw new NegativeBalanceException(this.balance - amount);
		}
		else {
			this.balance =  this.balance - amount;
		}
	}
	
	public void quickWithdraw(double amount) throws NegativeBalanceException {
		if (amount > this.balance) {
			throw new NegativeBalanceException();
		}
		else {
			this.balance =  this.balance - amount;
		}
	}
}
