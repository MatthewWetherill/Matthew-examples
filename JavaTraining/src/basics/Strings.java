package basics;

public class Strings {

	public static void main(String[] args) {
		/*
		String bookTitle;
		String wordChoice = "Cake";
		bookTitle = "Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book title contains the word " + wordChoice + ".");
		} else {
			System.out.println("The book title does NOT contain the word " + wordChoice + ".");
		}

		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome.");
		}
		*/
		
		String firstName = "Matthew";
		String lastName = "Wetherill";
		String SSN = "152623416787";
		
		if (SSN.length() > 10 ) {
		System.out.println("Fist name: " + firstName + ".");
		System.out.println("Last name: " + lastName + ".");
		System.out.println("SSN: " + SSN + "\nThere are " + SSN.length() + " digits in the SSN.");
		
		System.out.println("\n*************\n");
		
		String userID =  firstName.substring(0, 1) + lastName.substring(0, 2) + SSN.substring(8);
		System.out.println("User ID: " + userID);
		
		} else {
			System.out.println("Your SSN is too short!");
		}
	}

}
