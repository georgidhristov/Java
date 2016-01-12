
import java.util.Scanner;

public class Problem3FormattingNumbers {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double a = Double.parseDouble(scn.nextLine());
		double b = Double.parseDouble(scn.nextLine());
		double c = Double.parseDouble(scn.nextLine());
		
		
		System.out.printf("|%S       ", Integer.toHexString((int) a));
		System.out.printf(String.format("|%10s|", Integer.toBinaryString((int)a)).replace(" ", "0"));
		System.out.print("     ");
		System.out.printf("%.2f|%.3f   |", b, c);
	}
}
