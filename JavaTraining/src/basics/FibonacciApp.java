package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// The next number in the Fibonacci sequence is always the sum of the previous 2 numbers in the sequence
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
		System.out.println(fib(5));
		System.out.println(fib(6));
		System.out.println(fib(7));
		System.out.println(fib(8));
		System.out.println(fib(9));
		

	}
	
	public static int fib(int n) {
		if (n == 0 ) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		
		return (fib(n-1) + fib(n-2));
	}

}
