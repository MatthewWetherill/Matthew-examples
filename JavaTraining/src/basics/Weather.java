package basics;

public class Weather {
  public static void main(String[] args) {
	  //this program will give suggestions on what to wear based on  the weather (temperature and sun condition)
	  
	  int temperature = 10;
	  String sunCondition = "Overcast";
	  
	  if (temperature > 80) {
		  System.out.println("It's pleasant. Wear shorts and t-shirt.");
	  } else if ((temperature > 60) && (sunCondition == "Sunny")) {
		  System.out.println("It's cooler, perhaps you should stick a jumper on.");
		  System.out.println("Don't forget your sunglasses!");  
	  } else if ((temperature > 50) || (sunCondition == "Overcast")) {
		  System.out.println("This is a cooler day, make sure to wear warmer clothes.");
	  } else {
		  System.out.println("It's a cold one, I'd stay indoors if I were you.");
	  }
	  
	  System.out.println("The program is ending");
  }
}
