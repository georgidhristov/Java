import java.util.Scanner;

public class Problem6SumNumbersFrom1toN {

	public static void main(String[] args) {
		Scanner readLine = new Scanner(System.in);
		int input = readLine.nextInt();
		
		int result = 0;
		for (int i = 0; i <= input; i++) {
			result = result + i;
		}
		System.out.println(result);
	}
}
