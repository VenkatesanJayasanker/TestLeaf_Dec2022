package Week1.Day3;

import java.util.Arrays;

public class LearnArrays {
		public static void minMaxArray(int[] arr) {
			Arrays.sort(arr);
			int len = arr.length;
			System.out.println("Minimum Value :  "+arr[0]);
			System.out.println("Maximum Value :  "+arr[len - 1]);
			System.out.println("2nd Maximum Value :  "+arr[len - 2]);
		}
		
	public static void main(String[] args) {
		int [] arr = {56,66,4,3,2,5,7,8,9,11,23,45,6,4,22};
		minMaxArray(arr);

	}

}
