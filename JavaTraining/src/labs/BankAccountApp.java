package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		
		//Create new instance of BankAccount
		BankAccount acc1 = new BankAccount("121345665", 1242.50);
		acc1.setName("Matthew Wetherill");
		acc1.accrue();
		System.out.println(acc1.toString());		
	}

}

class BankAccount implements IInterest {
	
	//Properties of bank account
	private static int iD = 1000; //Internal iD - static means stays with the class, not the object being created
	private String accountNumber; // iD + random 2-digit number + first 2 SSN characters
	private static final String routingNumber = "004304"; //static means with the class, not object (like iD) - final means can't be changed
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit ) {
		balance = initDeposit;
		this.SSN = SSN; 
		iD++;
		setAccountNumber();
	}
	
	//This method creates a random account number
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Account Number: " + accountNumber);
	}
	
	
	//Getter and setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//Methods for deposit and withdrawals
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Deposit: " + amount);
		showBalance();
	}
	
	public void makeWithdrawal(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawal: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accrue() {
		balance = balance + (balance / 100 * rate);
		System.out.println("Calculating interest...");
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[ Name: " + name + " ]\n[ SSN: " + SSN + " ]\n[ ID: " + iD + " ]\n[ Acc No.: " + accountNumber + " ]\n[ Routing No.: " + routingNumber + " ]\n[ Current Balance: " + balance + " ]";
	}
	
	
}