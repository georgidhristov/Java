import java.util.Arrays;
import java.util.Scanner;

public class Problem15ImplementRecursiveBinarySearch {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = Integer.parseInt(scn.nextLine());
		
		int[] numbers = Arrays
				.asList(scn.nextLine()
				.split(" ")).stream()
				.mapToInt(Integer::parseInt)
				.toArray();
	
		int index = -1;
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] == n) {
				index = i;
				break;
			}
		}
		System.out.println(index);
	}
}
