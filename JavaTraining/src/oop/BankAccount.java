package oop;

public class BankAccount implements IRate {
	
	//define variables
	String accountNumber;
	//static - belongs to the object class NOT the instance
	//final - cannot be changed / constant (often see static and final together
	private static final String routingNumber = "101202";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructor definitions: unique methods
		//1. they are used to define/setup/initialise properties of an object
		//2. constructors are IMPLICITLY called on INSTANTIATION
		//3. the same name as the class itself
		//4. constructors have no return type
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	
	
	//overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		//initDeposit and Msg are local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("Initial Deposit: �" + initDeposit);
		String Msg = "";
		if (initDeposit < 500) {
			Msg = "ERROR: Minimum initial depsoit of �500.00";
		} else {
			Msg = "Thank you for your initial deposit of: �" + initDeposit;
		}
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	
	//getters and setters
	
			//allow user to define name
	
	public void setName(String name) {
		//'this' refers to 'name' at the top of the class and then sets it to the new 'name' variable in this method
		this.name = name;
	}
	
	public String getName() {
		return "NAME: " + name;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String getSsn() {
		return "SSN: " + ssn;
	}
	
	public String getAccountType() {
		return "ACCOUNT TYPE: " + accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	//Interface methods
	
	public void setRate() {
		System.out.println("SETTING RATE...");
	}
	
	public void increaseRate() {
		System.out.println("INCREASING RATE...");
	}

	//define methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT: �" + amount);
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAWAL: -�" + amount);
	}
	
	//because this is 'private' it can only be called from within the BankAccount class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR CURRENT BALANCE: �" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: �" + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ", ACCOUNT NUMBER: " + accountNumber + ", ROUTING NUMBER: " + routingNumber +  ", BALANCE: �" + balance + " ]";
	}
	
	
	
}
