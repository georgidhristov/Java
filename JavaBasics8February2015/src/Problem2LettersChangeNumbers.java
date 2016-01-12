import java.util.Scanner;

public class Problem2LettersChangeNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] input = scn.nextLine().replaceAll("\\s+", " ").trim().split(" ");
		
		double sum = 0;
		double result = 0;
		for (int i = 0; i < input.length; i++) {
			result = result + sum;
			char[] charArr = input[i].replaceAll("\\d+", "").toCharArray();
			double digits = Integer.parseInt(input[i].replaceAll("\\D+", ""));
				
			if (Character.isUpperCase(charArr[0])) {
				
				sum = digits / ((int)charArr[0] - 64);
			}else {
				
				sum = digits * ((int)charArr[0] - 96);
			}
			
			if (Character.isUpperCase(charArr[1])) {
				
				sum = sum - ((int)charArr[1] - 64);
			}else {
				
				sum = sum + ((int)charArr[1] - 96);
			}
		}
		result = result + sum;
		System.out.printf("%.2f",result);
	}
}
