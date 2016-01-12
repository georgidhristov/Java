import java.util.Arrays;
import java.util.Scanner;

public class Problem14SortArrayWithStreamAPI {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] array = Arrays
				.asList(scn.nextLine()
				.split(" ")).stream()
				.mapToInt(Integer::parseInt)
				.toArray();
	
		String string = scn.nextLine();
		
		Arrays.sort(array);
		
		if (string.equals("Descending")) {
			array = reverseArray(array);
		}
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
		}			
	}
	
	public static int[] reverseArray(int[] numbers) {
	    int[] reversedArray = new int[numbers.length];
	    for (int i = numbers.length-1, j = 0; i >= 0; i--, j++) {
	        reversedArray[j] = numbers[i];
	    }    
	    return reversedArray;
	}
}
