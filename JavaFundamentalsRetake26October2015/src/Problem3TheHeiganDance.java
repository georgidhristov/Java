import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3TheHeiganDance {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double playerDamage = Double.parseDouble(scn.nextLine());
		
		double playerHealth = 18_500;
		double heiganHealth = 3_000_000;
		
		List<Integer> damageWall = new ArrayList<>();
		
		int playerPosition = 77;
		int newPlayerPosition = 0;
		
		boolean whileRunning = true;	
		
		String input = scn.nextLine();
		while (whileRunning != false) {
			
			heiganHealth = heiganHealth - playerDamage;
			
			if (heiganHealth == 0) {
				break;
			}
			if (playerHealth == 0) {
				break;
			}
			
			if (input.contains("Cloud")) {
				
				int pos = Integer.parseInt(input.replaceAll("\\D+", ""));
				damageWall.add(pos + 9);
				damageWall.add(pos + 10);
				damageWall.add(pos + 11);
				damageWall.add(pos - 1);
				damageWall.add(pos);
				damageWall.add(pos + 1);
				damageWall.add(pos - 11);
				damageWall.add(pos - 10);
				damageWall.add(pos - 9);
				
				for (int i = 0; i < damageWall.size(); i++) {
					
					if (playerPosition == damageWall.get(i)) {
						
						playerHealth = playerHealth - 3_500;
					}
					
					newPlayerPosition = playerPosition ;
					if (newPlayerPosition + 10 != damageWall.get(i)) {
						
						newPlayerPosition = playerPosition + 10;
					}else if (newPlayerPosition + 1 != damageWall.get(i)) {
						
						newPlayerPosition = playerPosition + 1;
					}else if (newPlayerPosition - 10 != damageWall.get(i)) {
						
						newPlayerPosition = playerPosition + 1;
					}else if (newPlayerPosition - 1 != damageWall.get(i)) {
						
						newPlayerPosition = playerPosition - 1;	
					}
				}
			}
			
			if (heiganHealth <= 0) {
				whileRunning = false;
				
				System.out.println("Heigan: Defeated!");
				System.out.printf("Player: %f", playerHealth);
				System.out.println();
				System.out.printf("Final position: ");
			}else if (playerHealth <= 0) {
				whileRunning = false;
				
				System.out.printf("Heigan: %f", heiganHealth);
				System.out.println();
				if (input.contains("Cloud")) {
					
					System.out.printf("Player: Killed by Plague %s", input.replaceAll("\\d+", ""));
				}else {
					
					System.out.printf("Player: Killed by %s", input.replaceAll("\\d+", ""));
				}
				
				System.out.println();
				System.out.printf("Final position: %d", newPlayerPosition);
			}
			
			input = scn.nextLine();
		}
		scn.close();
	}
}
