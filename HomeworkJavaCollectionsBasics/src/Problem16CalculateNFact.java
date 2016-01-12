import java.util.Scanner;

public class Problem16CalculateNFact {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			
			result = result * i;
		}
		
		System.out.println(result);
	}
}
