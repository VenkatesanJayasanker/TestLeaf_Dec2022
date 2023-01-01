//Assignment 1: Print Fibonacci series for first 11 numbers

package Week1.Day2;

public class FibonacciSeries {
	public static void fibonacci(int n) {
		int a = 0, b = 1;
		System.out.print(a+ "  "+b);
		
		for(int i = 2; i < n;i++) {
			int c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		fibonacci(11);

	}

}
