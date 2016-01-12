import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1TinySporebat {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = scn.nextLine();
		
		int health = 5_800;
		
		List<String> list = new ArrayList<>();
		
		while (!input.equals("Sporeggar")) {
			
			if (!input.equals("Sporeggar")) {
				
				if (input.charAt(input.length() - 1) >= 48 
				&& (input.charAt(input.length() - 1) <= 57)) {
					
					list.add(input);
				}else {
					
					System.out.println("Invalid Input");
				}
			}
			input = scn.nextLine();
		}
		
		int glowcaps = 0;
		for (int i = 0; i < list.size(); i++) {
			
			char[] charArr = list.get(i).toCharArray();
			for (int j = 0; j < charArr.length - 1; j++) {
				
				if (charArr[j] == 'L') {
					
					health = health  + 200;
				}else {
					
					health = health - charArr[j];
				}
				
				if (health <= 0) {
					break;
				}else {
				
					if (j == charArr.length - 2) {
						String hand = "";
						hand = hand + charArr[j + 1];
						glowcaps = glowcaps + Integer.parseInt(hand);
						hand = "";
					}
				}
			}
		}
		
		if (health > 0) {
			
			System.out.printf("Health left: %s", health);
			System.out.println();
			
			if (glowcaps >= 30) {
				
				System.out.printf("Bought the sporebat. Glowcaps left: %d", glowcaps - 30);
			}else if (glowcaps < 30) {
				
				System.out.printf("Safe in Sporeggar, but another %d Glowcaps needed.", 30 - glowcaps);
			}
		}else {
			
			System.out.printf("Died. Glowcaps: %d", glowcaps);
		}
		scn.close();
	}
}
