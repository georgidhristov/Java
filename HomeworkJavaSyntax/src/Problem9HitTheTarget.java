import java.util.Scanner;

public class Problem9HitTheTarget {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int target = scn.nextInt();
		
		for (int i = 1; i <= 20; i++) {
			
			for (int j = 1; j <= 20; j++) {
				
				int a = i + j;
				
				int b = i - j;
				
				if (a == target) {
					
					System.out.println(String.format("%d + %d = %d", i, j, a));
					
				}else if (i - j == target) {
					
					System.out.println(String.format("%d - %d = %d", i, j, b));
				}
			}
		}
	}
}
