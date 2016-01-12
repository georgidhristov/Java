import java.util.Scanner;

public class Problem5CountAllWords {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] arr = scn.nextLine().split("\\W+");
		
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			
			result = i + 1;
		}
		
		System.out.println(result);
	}
}
