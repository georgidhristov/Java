import java.util.Random;
import java.util.Scanner;

public class Problem7RandomizeNumbersFromNToM {
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		int m = scn.nextInt();
		
		Random rand = new Random();
		
		if (n > m) {
			
			for (int i = m; i <= n; i++) {
				
				int value = rand.nextInt(m) + n; 
				
				System.out.print(value + " ");	
			}
		}else {
			for (int i = n; i <= m; i++) {
				
				int value = rand.nextInt(n) + m; 
				
				System.out.print(value + " ") ;	
			}
		}
	}
}
