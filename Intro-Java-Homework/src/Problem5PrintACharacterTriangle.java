import java.util.Scanner;

public class Problem5PrintACharacterTriangle {

	public static void main(String[] args) {
		Scanner readLine = new Scanner(System.in);
		int input = readLine.nextInt();
		
		for (int i = 0; i <= input; i++) {
			for (int j = 97; j < 97 + i; j++) {
				System.out.print((char)j + " ");	
			}
			System.out.println();
		}
		
		for (int i = 1; i < (input * 2); i++) {
			for (int j = 97; j < 97 + input - i; j++) {
				System.out.print((char)j + " ");	
			}
			System.out.println();
		}
	}
}
