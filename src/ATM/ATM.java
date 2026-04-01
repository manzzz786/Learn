package ATM;

public class ATM {
	static int bal = 0;
	public static void displayBalance() {
		System.out.println("Current balance is $" + bal+"/-");
	}
	
	public static int deposit(int a) {
		bal = bal + a;
		System.out.println("$"+a+ "/- Has been depostied sucessfully!!!");
		return bal;
	}
	
	public static int withdraw(int b) {
		
		if (b > bal) {
			System.out.println("***Amount $"+b+"/- Cannot be withdrawn due to Insufficient balance.***");
		}
		else {
			bal = bal - b;
			System.out.println("$"+b+ "/- Has been withdrawn sucessfully!");
		}
		return bal;
	}
	
}
