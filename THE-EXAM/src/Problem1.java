import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int people = Integer.parseInt(scn.nextLine());
		int lines = Integer.parseInt(scn.nextLine());
		String input = "";
		
		int beds = 0;
		int food = 0;
		
		for (int i = 0; i < lines; i++) {
			input = scn.nextLine();
			
			if (input.contains("tents")) {	
				if (input.contains("firstClass")) {
					
					int number = Integer.parseInt(input.replaceAll("\\D+", ""));
					int sum = 3 * number;
					
					beds = beds + sum;
					
				}if (input.contains("normal")) {
					
					int number = Integer.parseInt(input.replaceAll("\\D+", ""));
					int sum = 2 * number;
					
					beds = beds + sum; 
				}
			}
			if (input.contains("rooms")) {
				if (input.contains("single")) {

					int number = Integer.parseInt(input.replaceAll("\\D+", ""));
					int sum = 1 * number;
					
					beds = beds + sum; 
					
				}if (input.contains("double")) {

					int number = Integer.parseInt(input.replaceAll("\\D+", ""));
					int sum = 2 * number;
					
					beds = beds + sum;  
					
				}if (input.contains("triple")) {

					int number = Integer.parseInt(input.replaceAll("\\D+", ""));
					int sum = 3 * number;
					
					beds = beds + sum; 
				}
			}
			if (input.contains("food")) {
				if (input.contains("musaka")) {
					
					int number = Integer.parseInt(input.replaceAll("\\D+", ""));
					int sum = 2 * number;
					
					food = food + sum;
					
				}if (input.contains("zakuska")) {
					
					continue;
				}
			}
		}
		
		beds = beds - people;
		if (beds >= 0) {
			
			System.out.printf("Everyone is happy and sleeping well. Beds left: %d", Math.abs(beds));
			System.out.println();
		}else if (beds < 0) {
			
			System.out.printf("Some people are freezing cold. Beds needed: %d", Math.abs(beds));
			System.out.println();
		}
		
		food = food - people;
		if (food >= 0) {
			
			System.out.printf("Nobody left hungry. Meals left: %d", Math.abs(food));
		}else if (food < 0) {
			
			System.out.printf("People are starving. Meals needed: %d", Math.abs(food));
		}
		
		scn.close();
	}
}
