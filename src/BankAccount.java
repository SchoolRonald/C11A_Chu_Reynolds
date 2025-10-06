/*
 * Name: Ronald Chu and Jonah Reynolds
 */



public class BankAccount {
	
	//creates an instance variable of type double named balance
	private double balance;
	
	
	//1-parameter constructor that sets the balance
	BankAccount (double balance) {
		this.balance = balance;
	}
	
	//instance method that takes a a parameter of double amount and throws negative balance
	public void withdraw(double amount) throws NegativeBalanceException {
		
		//if the amount to withdraw is greater than the balance, throws
		if (amount > this.balance) {
			throw new NegativeBalanceException(this.balance - amount);
		}
		
		//otherwise it will update the balance (subtracting the amount being withdrawn)
		else {
			this.balance =  this.balance - amount;
		}
	}
	
	
	//instance method that also takes the amount from the user along with a throws NegativeBalanceException
	public void quickWithdraw(double amount) throws NegativeBalanceException {
		
		//if the amount withdrawn exceeds the balance, it will throw a NegativeBalanceException
		if (amount > this.balance) {
			
			//doesn't know the balance
			throw new NegativeBalanceException();
		}
		
		//otherwise it will update the balance with the new balnace
		else {
			this.balance =  this.balance - amount;
		}
	}
}
