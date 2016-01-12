import java.util.Scanner;

public class Problem2MagicCard {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] hand = scan.nextLine().split(" ");
		String oddOrEven = scan.nextLine();
		String magicCard = scan.nextLine();
		
		if (oddOrEven.equals("odd")) {
			int result = TheValueOfTheHandOdd(hand, oddOrEven, magicCard);
			System.out.println(result);
		}
		else if (oddOrEven.equals("even")) {
			int result = TheValueOfTheHandEven(hand, oddOrEven, magicCard);
			System.out.println(result);
		}
	}
	
	
	public static int TheValueOfTheHandOdd(String[] hand, String oddOrEven, String magicCard){
		
		if (magicCard.contains("10")) {
			magicCard = magicCard.replace("10", "G");
		}
		for (int i = 0; i < hand.length; i++) {
			if (hand[i].contains("10")) {
				hand[i] = hand[i].replace("10", "G");
			}
		}		

		String[] split =  magicCard.split("");
		
		//S H D C	
		int result = 0; 	
		for (int i = 0; i < hand.length; i++) {
			if (oddOrEven.equals("odd")) {
				if (i % 2 != 0) {
					
					if (hand[i].contains("2")) {

						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (20 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (20 * 2);
						}
						else {
							result = result + 20;
						}		
					}
					
					else if (hand[i].contains("3")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (30 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (30 * 2);
						}
						else {
							result = result + 30;
						}	

					}
					
					else if (hand[i].contains("4")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (40 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (40 * 3);
						}
						else {
							result = result + 40;
						}		
					}
					
					else if (hand[i].contains("5")) {
												
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (50 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (50 * 2);
						}
						else {
							result = result + 50;
						}	
					}
					
					else if (hand[i].contains("6")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (60 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (60 * 2);
						}
						else {
							result = result + 60;
						}											
					}
					
					else if (hand[i].contains("7")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (70 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (70 * 2);
						}
						else {
							result = result + 70;
						}			
					}
					
					else if (hand[i].contains("8")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (80 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (80 * 2);
						}
						else {
							result = result + 80;
						}	
					}
					
					else if (hand[i].contains("9")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (90 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (90 * 2);
						}
						else {
							result = result + 90;
						}		
					}
					
					else if (hand[i].contains("G")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (100 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (100 * 2);
						}
						else {
							result = result + 100;
						}
					}
					
					else if (hand[i].contains("J")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (120 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (120 * 2);
						}
						else {
							result = result + 120;
						}
					}
					
					else if (hand[i].contains("Q")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (130 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (130 * 2);
						}
						else {
							result = result + 130;
						}			
					}
					
					else if (hand[i].contains("K")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (140 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (140 * 2);
						}
						else {
							result = result + 140;
						}					
					}
					
					else if (hand[i].contains("A")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (150 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (150 * 2);
						}
						else {
							result = result + 150;
						}			
					}
				}
			}
		}
		return result;
	}
	
public static int TheValueOfTheHandEven(String[] hand, String oddOrEven, String magicCard){
		
		if (magicCard.contains("10")) {
			magicCard = magicCard.replace("10", "G");
		}
		for (int i = 0; i < hand.length; i++) {
			if (hand[i].contains("10")) {
				hand[i] = hand[i].replace("10", "G");
			}
		}		

		String[] split =  magicCard.split("");
		
		//S H D C	
		int result = 0; 	
		for (int i = 0; i < hand.length; i++) {
			if (oddOrEven.equals("even")) {
				if (i % 2 == 0) {
					
					if (hand[i].contains("2")) {

						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (20 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (20 * 2);
						}
						else {
							result = result + 20;
						}		
					}
					
					else if (hand[i].contains("3")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (30 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (30 * 2);
						}
						else {
							result = result + 30;
						}	

					}
					
					else if (hand[i].contains("4")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (40 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (40 * 3);
						}
						else {
							result = result + 40;
						}		
					}
					
					else if (hand[i].contains("5")) {
												
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (50 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (50 * 2);
						}
						else {
							result = result + 50;
						}	
					}
					
					else if (hand[i].contains("6")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (60 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (60 * 2);
						}
						else {
							result = result + 60;
						}											
					}
					
					else if (hand[i].contains("7")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (70 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (70 * 2);
						}
						else {
							result = result + 70;
						}			
					}
					
					else if (hand[i].contains("8")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (80 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (80 * 2);
						}
						else {
							result = result + 80;
						}	
					}
					
					else if (hand[i].contains("9")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (90 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (90 * 2);
						}
						else {
							result = result + 90;
						}		
					}
					
					else if (hand[i].contains("G")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (100 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (100 * 2);
						}
						else {
							result = result + 100;
						}
					}
					
					else if (hand[i].contains("J")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (120 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (120 * 2);
						}
						else {
							result = result + 120;
						}
					}
					
					else if (hand[i].contains("Q")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (130 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (130 * 2);
						}
						else {
							result = result + 130;
						}			
					}
					
					else if (hand[i].contains("K")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (140 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (140 * 2);
						}
						else {
							result = result + 140;
						}					
					}
					
					else if (hand[i].contains("A")) {
						
						String[] splitHand = hand[i].split("");
						if (splitHand[0].equals(split[0])) {
							result = result + (150 * 3);
						}
						else if (splitHand[1].equals(split[1])) {
							result = result + (150 * 2);
						}
						else {
							result = result + 150;
						}			
					}
				}
			}
		}
		return result;
	}
}