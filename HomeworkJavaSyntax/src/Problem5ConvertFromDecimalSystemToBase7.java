import java.util.Scanner;

public class Problem5ConvertFromDecimalSystemToBase7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		long decimal = scn.nextInt();
		
		String base7 = Integer.toString((int) decimal, 7);
		
		System.out.println(base7);
	}
}
