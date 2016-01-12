import java.util.Scanner;

public class Problem13GetFirstOddOrEvenElements {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] numbers = scn.nextLine().split(" ");
		
		String input = scn.nextLine();
		
		if (input.contains("odd")) {
			
			String digit = input.replaceAll("\\D+","");
			
			int len = Integer.parseInt(digit);
			
			int count = 0;
			
			for (int i = 0; i < numbers.length; i++) {
				
				if (Integer.parseInt(numbers[i]) % 2 != 0) {
					
					count = count + 1;	
					
					if (count <= len ) {
						
						System.out.printf("%d ", Integer.parseInt(numbers[i]));
					}
				}
			}
		}else {
			
			String digit = input.replaceAll("\\D+","");
			
			int len = Integer.parseInt(digit);
			
			int count = 0;
			
			for (int i = 0; i < numbers.length; i++) {
				
				if (Integer.parseInt(numbers[i]) % 2 == 0) {
					
					count = count + 1;	
					
					if (count <= len ) {
						
						System.out.printf("%d ", Integer.parseInt(numbers[i]));
					}
				}
			}
		}
	}
}
