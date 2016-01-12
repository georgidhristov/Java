import java.util.Scanner;

public class Problem6CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] input = scn.nextLine().split(" ");
		String word = scn.nextLine();
		
		int count = 0;
		
		for (int i = 0; i < input.length; i++) {
			
			if (input[i].toLowerCase().equals(word)) {
				
				count++;
			}
		}
		System.out.println(count);
	}
}
