package oop;

class Cat {
	String name;
	String color;
	String age;
	
	void catName() {
		System.out.println("This cat's name is " + name + ".");
	}
	
	void catColor() {
		System.out.println("This cat is " + color + ".");
	}
	
	void catAge() {
		System.out.println("This cat is " + age + " years old.");
	}
	
	void catAllInfo() {
		System.out.println(name + " is a " + age + " year old " + color + " cat.");
	}
}

public class demoMatthew {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.name = "Brian";
		cat1.color = "black";
		cat1.age = "18";
		
		Cat cat2 = new Cat();
		cat2.name = "Ruby";
		cat2.color = "ginger";
		cat2.age = "10";
		
		Cat cat3 = new Cat();
		cat3.name = "Alfie";
		cat3.color = "black/white";
		cat3.age = "6";
		
		cat1.catAllInfo();
		
		cat2.catAllInfo();
		
		cat3.catAllInfo();
		

	}

}
