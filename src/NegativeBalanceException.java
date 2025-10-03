import java.io.*;



public class NegativeBalanceException extends Exception {
	
	//one instance variable of type double named negativeBalance
	private double negativeBalance;
	
	//default constructor that calls super() and sets the exception message
	//to Error: negative balance
	NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	
	//A 1-parameter constructor that sets the instance variable and calls super()
	// with the message "Amount exceeds balance by [negative balance]
	NegativeBalanceException(double negative) {
		super("Amount Exceeds balance by " + negative);
		
		//assigns the objects negative balance, to the negative balance
		//that is inputed
		this.negativeBalance = negative;
		
		//write the same message to a log file
		PrintWriter out;
		
		//try and catch to make sure that logfile is printed out too
		try {
			//declares and prints out the amount exceeds balance by [negative balance]
			out = new PrintWriter("logfile.txt");
			out.println("Amount Exceeds balance by " + this.negativeBalance);
			
			//must close the writer to finalize file
			out.close();
			
		} catch (FileNotFoundException e) {
			
			//prints out that it could not output to logfile.txt if it fails
			System.out.println("Could not output to logfile.txt");
		}
	
	}

	//create a toString to print out the Balance of [negative balance] not allowed
	@Override
	public String toString() {
		return "Balance of " + negativeBalance + "not allowed";
	}
	
	
}
