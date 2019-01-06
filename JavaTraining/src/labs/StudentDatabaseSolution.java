package labs;

public class StudentDatabaseSolution {

public static void main(String[] args) {
		
	//Create a student
	Student stu1 = new Student("Matthew", "112233445");	
	stu1.enroll("Math101");
	stu1.enroll("Germ205");
	stu1.enroll("Hist208");
	
	stu1.showCourses();
	stu1.checkBalance();
	stu1.payTuition(1250);
	stu1.checkBalance();
	
	System.out.println(stu1.toString());	
	}
	
}

class Student {
	
	//Properties
	private static int iD = 0;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String county;
	private String townCity;
	private String courses = "";
	private static final int costOfCourse = 500;
	private int balance = 0;
	
	//Constructor
	public Student(String name, String ssn) {
		System.out.println("\n**********\n\nNEW STUDENT REGISTERED: " + name + "\n\n**********\n");
		iD++;
		this.name = name;
		this.ssn = ssn;
		setUserId();
		setEmail();
	}
	
	//getters/setters
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getTownCity() {
		return townCity;
	}

	public void setTownCity(String townCity) {
		this.townCity = townCity;
	}
	
	//Email generator method - getter/setter
	private void setEmail() {
		email = name.toLowerCase() + "." + iD + "@studb.com";
		System.out.println("Your Email: " + email);
	}

	//User ID generator method
	private void setUserId() {
		//set range for random number between 1000 and 9000
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * (max - min)); // (max - min) calculates range of numbers, this gives number between 0 - 8000
		randNum = randNum + min; //this now makes randNum fall between 1000 and 9000
		userId = iD + "" + randNum + ssn.substring(5); //quote marks needed otehrwise it would add the iD and randNum together rather than concatenate
		System.out.println("Your User ID: " + userId);
	}
	
	
	//other methods
	public void enroll(String course) {
		this.courses = this.courses + "   | " + course + " |   ";
		balance = balance + costOfCourse;
		System.out.println("\n**********\n\nYou have enrolled in: " + course + " | �" + costOfCourse);
	}
	
	public void payTuition(int amount) {
		balance = balance - amount;
		System.out.println("\n**********\n\nPAYMENT MADE\nThank you for your payment of �" + amount + ". \nYour balance is now : �" + balance);
	}
	
	public void checkBalance() {
		System.out.println("\n**********\n\nBalance: �" + balance);
	}
	
	public void showCourses() {
		System.out.println("\n**********\n\nYou are enrolled in the following courses...\n\n" + courses);
	}
	
	@Override
	public String toString() {
		return "\n\n**********USER INFORMATION**********\n\n[ NAME: " + name + " ]\n[ USER ID: " + userId + " ]\n[ EMAIL: " + email + " ]\n[ COURSES: " + courses + " ]\n[ BALANCE: �" + balance + " ]";
	}
	
}
