import java.util.Scanner;

public class Problem6ConvertFromBase7ToDecimal {

	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		
		String base7 = scn.nextLine();
		
		int decimal = Integer.parseInt(base7, 7);
		
		System.out.println(decimal);
	}
}
