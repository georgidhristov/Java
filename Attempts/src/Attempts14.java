import java.util.Random;

public class Attempts14 {

	public static void main(String[] args) {
		//Array Elements as Counters.
		
		Random rand = new Random();
		int joro[] = new int[7];
		
		for (int roll = 1; roll < 1000; roll++) {
			++joro[1+rand.nextInt(6)];
			
		}
		System.out.println("Face\tFrequency");
		
		for (int face = 1; face < joro.length; face++) {
			System.out.println(face + "\t" + joro[face]);
		}
	}

}
