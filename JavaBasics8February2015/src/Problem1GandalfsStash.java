import java.util.Scanner;

public class Problem1GandalfsStash {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int points = Integer.parseInt(scn.nextLine());		
		
		String[] food = scn.nextLine()
				.replaceAll("\\W+", " ")
				.replace("_", "")
				.replaceAll("\\s+", " ")
				.split(" ");
		
		for (int i = 0; i < food.length; i++) {

			food[i] = food[i].trim().toLowerCase();
			
			if (food[i].equals("cram")) {
				
				points = points + 2;
			}else if (food[i].equals("lembas")) {
				
				points = points + 3;
			}else if (food[i].equals("apple")) {
				
				points = points + 1;
			}else if (food[i].equals("melon")) {
				
				points = points + 1;
			}else if (food[i].equals("honeycake")) {
				
				points = points + 5;
			}else if (food[i].equals("mushrooms")) {
				
				points = points - 10;
			}else {
				
				points = points - 1;
			}
		}
		
		System.out.println(points);
		
		if (points < -5) {
			
			System.out.println("Angry");
		}else if (points >= -5 && points <= 0) {
			
			System.out.println("Sad");
		}else if (points > 0 && points <= 15) {
			
			System.out.println("Happy");
		}else if (points > 15) {
			
			System.out.println("Special JavaScript mood");
		}
	}
}
