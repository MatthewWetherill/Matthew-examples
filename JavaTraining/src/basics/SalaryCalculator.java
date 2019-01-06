package basics;

public class SalaryCalculator {
  public static void main(String[] args) {
	  //lets create a variable to define our career
	  
	  //Declare a variable
	  String career;
	  System.out.println("Program is starting");
	  
	  //Define a variable
	  career = "Software Developer";
	  System.out.println("My career is: " + career);
	  
	  //Declare and define
	  int hoursPerWeek = 40;
	  int weeksPerYear = 52;
	  double rate = 42.50;
	  
	  //Compute our annual salary
	  double salary =  hoursPerWeek * weeksPerYear * rate;
	  System.out.println("My annual salary as a " + career + ", at a rate of £" + rate + " per hour, is £" + salary + ".");
	  //rate * hoursPerWeek * weeksPerYear
  }
}
