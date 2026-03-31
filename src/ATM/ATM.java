package ATM;

public class ATM {
	static int bal = 0;
	public static void displayBalance() {
		System.out.println("Current balance is " + bal);
	}
	
	public static int deposit(int a) {
		bal = bal + a;
		return bal;
	}
	
	public static int withdraw(int b) {
		
		if (b > bal || bal <= 0) {
			System.out.println("Insufficient balance Or Amount requested for withdrawl is greater than availble balance amount.");
		}
		else {
			bal = bal - b;
		}
		return bal;
	}
	
	public static void main(String args[]) {
		ATM.displayBalance();
		ATM.deposit(1000);
		ATM.displayBalance();
		ATM.withdraw(1500);
		ATM.displayBalance();
		withdraw(500);
		displayBalance();
		withdraw(500);
		displayBalance();
		withdraw(500);
		displayBalance();
		withdraw(500);
		}
}
