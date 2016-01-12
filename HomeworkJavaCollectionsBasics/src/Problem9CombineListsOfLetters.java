import java.util.Scanner;

public class Problem9CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String input = scn.nextLine();
		
		String[] search = scn.nextLine().split(" ");
		
		for (int i = 0; i < search.length; i++) {
			
			if (!input.contains(search[i])) {
				
				input = input + " " + search[i] ;
			}
		}
		System.out.println(input);
	}
}
