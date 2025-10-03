import java.io.*;



public class NegativeBalanceException extends Exception {
	private double negativeBalance;
	
	
	NegativeBalanceException() {
		super("Error: negative balance");
	}
	
	NegativeBalanceException(double negative) {
		super("Amount Exceeds balance by " + negative);
		this.negativeBalance = negative;
		try {
			FileWriter writer = new FileWriter("logfile.txt");
			writer.write("Amount Exceeds balance by " + negative);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Balance of " + negativeBalance + "not allowed";
	}
	
	
}
