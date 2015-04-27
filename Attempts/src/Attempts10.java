import java.util.Dictionary;
import java.util.Random;

public class Attempts10 {
	public static void main(String[] args) {
		//Random number generator.
		
		Random dice = new Random();
		int number;
		
		for(int counter = 1; counter <= 4; counter++) {
			number = dice.nextInt(5);
			System.out.println(number + " ");
			
		}
			
	}
}
