package Week1.Day3;

public class LearnString {
	public static void  strOccur(String str,char a) {
		char[] arr = str.toCharArray();
		int count = 0;
		for(char c : arr) {
			if(c == a) {
				count++;
			}
		}
		System.out.println(a + " occurs "+ count +" times in the string "+ str);
		
	}
	public static void main(String[] args) {
		String str = "testleaf";
		char check = 't';
		strOccur(str,check);

	}

}
