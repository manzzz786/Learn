package ATM;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		boolean l = true; 
		//This variable is for starting the loop.
		
		
		System.out.println("***Welcome To Mybank ATM***");
		
		Scanner sc = new Scanner(System.in);
		
		while (l) {
			System.out.println("Please select an option.\n1.Display Balance.\n2.Deposit.\n3.Withdraw.");
			int ch = sc.nextInt();

			
			switch (ch) {
				case 1:
					ATM.displayBalance();
					break;
					
				case 2:
					System.out.println("Enter the amount to be deposited.");
					int d = sc.nextInt();
					ATM.deposit(d);
					break;
					
				case 3:
					System.out.println("Enter the amount to be withdrawn.");
					int w = sc.nextInt();
					ATM.withdraw(w);
					break;
					
				default :
					System.out.println("***Wrong option entered.***");
					System.out.println("Select options from 1 to 3 only.");
					break;
				
				}
			
			System.out.println("Do you want to continue?(Y/N).");
			String b = sc.next();
			if(b.equalsIgnoreCase("N"))
				l = false;
		}
		
		System.out.println("***Thankyou.***");
		sc.close();	
	}

}
