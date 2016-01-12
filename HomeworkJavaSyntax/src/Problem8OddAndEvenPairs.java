import java.util.Scanner;

public class Problem8OddAndEvenPairs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] numbers = scn.nextLine().split(" ");
		
		if (numbers.length % 2 != 0) {
			
			System.out.println("Invalid length");
			
		}else {
		
			for (int i = 0; i < numbers.length - 1; i = i + 2) {
				
				int firstInt = Integer.parseInt(numbers[i]);
				int secondInt = Integer.parseInt(numbers[i + 1]);

				if (firstInt % 2 != 0 && secondInt % 2 != 0) {
					
					System.out.printf("%d, %d -> both are odd", firstInt, secondInt);
					System.out.println();
					
				}else if (firstInt % 2 == 0 && secondInt % 2 == 0) {
					
					System.out.printf("%d, %d -> both are even", firstInt, secondInt);
					System.out.println();
					
				}else if (firstInt % 2 == 0 && secondInt % 2 != 0 
						|| firstInt % 2 != 0 && secondInt % 2 == 0) {
					
					System.out.printf("%d, %d -> different", firstInt, secondInt);
					System.out.println();
				}
			}			
		}
	}
}
