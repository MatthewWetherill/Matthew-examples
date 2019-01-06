package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		// create new bank account (whenever we see 'new' think to instantiate an object)
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Matthew Wetherill";
		//With encapsulation is better, see below
		
		acc1.setName("Matthew Wetherill");
		System.out.println(acc1.getName());
		
		acc1.setSsn("010101222");
		System.out.println(acc1.getSsn());
		
		acc1.setAccountType("Savings Account");
		System.out.println(acc1.getAccountType());
		
		
		acc1.accountNumber = "12123434";
		acc1.balance = 1500.00;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(500);
		acc1.deposit(300);
		acc1.withdraw(125);
		acc1.deposit(80);
		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
	
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		
		BankAccount acc3 = new BankAccount("Savings Account", 850.00);
		
		/*
		acc3.checkBalance();
		
		CDAccount cd1 = new CDAccount();
		cd1.name = "Lauren Ogley";
		cd1.accountNumber = "21123443";
		cd1.accountType = "CD account";
		cd1.balance = 2543.56;
		*/
		
		/*
		System.out.println(cd1.toString());
		cd1.compound();
		*/
		
	}

}
