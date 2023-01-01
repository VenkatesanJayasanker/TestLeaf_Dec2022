package Week1.Day2;

public class Calculator {
	public static int addThreeNum(int a,int b, int c) {
		return a+b+c;
	}
	public static int multiply(int a , int b) {
		return a*b;
	}
	public static void divide() {
		double a = 10;
		double b = 5;
		System.out.println(a/b);
	}
	public static void main(String[] args) {
//		int sum = addThreeNum(5,10,15);
//		int mul = multiply(6,7);
//		System.out.println(sum);
//		System.out.println(mul);
//		divide();
		for(int i  =0; i <21;i++) {
			if(i%2==0) {
				System.out.print(i+",");
			}
		}

	}

}
