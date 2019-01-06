package labs;

public class StudentDatabase {

	public static void main(String[] args) {
		
		NewStudent newStu1 = new NewStudent("Matthew", "Wetherill", "11223344");
	}

}

class NewStudent {
	
	//Properties of new student
	private static int dbRef = 1000;
	private String firstName;
	private String lastName;
	private String SSN;
	private String phone;
	private String county;
	private String city;
	private String stuId;
	private String mailId;
	private static final int courseCost = 500;
	private static int balance;
	
	//Constructor
	public NewStudent(String firstName, String lastName, String SSN) {
		System.out.println("NEW STUDENT REGISTERED: " + firstName + " " + lastName);
		dbRef++;
		System.out.println("DATABASE REF: " + dbRef);
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		getMailId();
		getStuId();
	}
	
	//Method to generate email address
	public void getMailId() {
		String mailId = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@studentdatabase.com";
		System.out.println("EMAIL ID: " + mailId);
	}
	
	public void getStuId( ) {
		int min = 1000;
		int max = 9000;
		int random = (int) (Math.random() * (max - min));
		random = random + min;
		String stuId = dbRef + "" + random + SSN.substring(4, 8);
		System.out.println("STUDENT ID: " + stuId);
	}
	
	//getters/setters for phone, county, city
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setCounty(String county) {
		this.county = county;
	}
	
	public String getCounty() {
		return county;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
}
