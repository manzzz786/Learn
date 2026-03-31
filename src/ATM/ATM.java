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
		bal = bal - b;
		return bal;
	}
	
	public static void main(String args[]) {
		ATM.displayBalance();
		ATM.deposit(1000);
		ATM.displayBalance();
		ATM.withdraw(500);
		ATM.displayBalance();
		ATM.deposit(6);
		ATM.displayBalance();
		ATM.deposit(1);
		ATM.displayBalance();
		ATM.withdraw(5);
		ATM.displayBalance();
		ATM.withdraw(6);
		ATM.displayBalance();
		}
}
