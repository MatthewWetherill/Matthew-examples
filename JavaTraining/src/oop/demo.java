package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	
	void eat() {
		System.out.println(name + " is eating.");
	}
	
	void sleep() {
		System.out.println(name + " is sleeping.");
	}
	
}

public class demo {

	public static void main(String[] args) {
		
		//instantiating an object
		Person person1 = new Person();
		
		//define some properties
		person1.name = "Brian";
		person1.email = "brian@gmail.com";
		person1.phone = "0123456789";
		
		//abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Ruby";
		person2.sleep();
		
		/*
		// Person-
		
		// Attributes, variables, adjectives, descriptors-
		String name = "Matthew";
		String email = "matthew@testemail.com";
		String phone = "01604843675";
				
		// Action, activity, behaviour-
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		//What if we needed to do the above for another person?
		String name2 = "Lauren";
		String email2 = "lauren@testemail.com";
		String phone2 = "01604345678";
				
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");

	}
	
	//That works, but how can it be more efficient?
	//We can add functions to minimise code
			
	static void walking(String name) {
		System.out.println(name + " is walking.");
		*/
		}
		

}
