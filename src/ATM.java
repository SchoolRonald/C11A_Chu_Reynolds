/*
 * Name: Ronald Chu and Jonah Reynolds
 * CSCI306A
 * 
 */


//import java package

//public class atm
public class ATM {
	private BankAccount account;

	ATM() {
		super();
		
		//sets the account to $500
		this.account = new BankAccount(500);
		
	}
	
	public void handleTransactions() {
		
		//do a try/catch
		try {
			//call withdraw with 600
			this.account.withdraw(600);
		
		
		} catch (NegativeBalanceException e) {
			
			//first print (still prints out the balance, even without knowing what the amount is inside
			//the bank account
			System.out.println(e);
			
			//second print that tells us an error 
			System.out.println(e.getMessage());
			
		}
		
		
		//do another try catch (same thing with a quick withdraw instead)
		try {
				
			//call withdraw with 600, but quickWithdraw
			this.account.quickWithdraw(600);	
			
		} catch (NegativeBalanceException e) {
					
			//first print
			System.out.println(e);
					
			//second print
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void main(String[] args) {
		
		//create an atm object
		ATM atm = new ATM();
		
		//handle transactions
		atm.handleTransactions();
		
	}

}
