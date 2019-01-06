package basics;

public class Factorials {

	public static void main(String[] args) {
		// 1! = 1;
		// 2! = 2 * 1;
		// 3! = 3 * 2 * 1;
		// 4! = 4 * 3 * 2 * 1;
		
		int[] numbers = {15, 4, 3, -14, 7, 62, 7, 28, 9, 5};
		
		System.out.println("\n****Sum of numbers in an array****\n");
		System.out.println(sum(numbers));
		System.out.println("\n****Factorial of a number****\n");
		System.out.println(factorial(5));
		System.out.println("\n****Max value of numbers in an array****\n");
		System.out.println(findMax(numbers));
		System.out.println("\n****Min Value of numbers in an array****\n");
		System.out.println(findMin(numbers));
		System.out.println("\n****Average of all the numbers in an array****\n");
		System.out.println(average(numbers));
	}
	
	
	//sum of all the numbers in an array
	public static int sum(int[] numbers) {
		
		int sum = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		
		return sum;
	}
	
	//calculate the factorial of a number (recursion
	public static int factorial(int n) {
		
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return factorial(n-1) * n;
		
	}
	
	//find the max value in an array 
	public static int findMax(int[] arr) {
		
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
		
	}
	
	//find the max value in an array
	public static int findMin(int[] arr) {
		
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
		
	}
	
	//Find the average of all the numbers in array
	public static int average(int[] arr) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return sum / arr.length;
		
	}

}
