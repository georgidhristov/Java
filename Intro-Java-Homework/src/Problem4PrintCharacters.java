import java.util.Scanner;


public class Problem4PrintCharacters {

	public static void main(String[] args) {
		
		Scanner readLine = new Scanner(System.in);
		
		int input = readLine.nextInt();
		
		if (input > 26) {
			input = 26;
		}

		for (int i = 97; i < 97 + input; i++) {
			System.out.print((char)i + " ");
		}

	}
}
