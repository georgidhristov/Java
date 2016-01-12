import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem4LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = Arrays.asList(scn.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();		
		List<String> list = new ArrayList<>();	
		String longestSequence = "";		
		int a = 0;
		int b = 0;
		for (int i = 0; i < arr.length; i++) {	
			a = arr[i];
			if (i < arr.length - 1) {
				b = arr[i + 1];
			}			
			if (a < b) {
				longestSequence = longestSequence + arr[i] + " ";
			}else {	
				longestSequence = longestSequence + arr[i];
				list.add(longestSequence);		
				longestSequence = "";				
			}
		}	
		for (String string : list) {	
			System.out.println(string);
		}
		String result = "";	
		int count = 0;	
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).length() != list.get(i + 1).length()) {
				count++;
			}
			if (list.get(i).length() >= list.get(i + 1).length()) {		
				result = list.get(i);
			}else {
				result = list.get(i + 1);
			}
		}
		if (count == 0) {	
			System.out.print("Longest: ");
			System.out.printf(list.get(0));
		}else {
			if (result.length() == 1) {
				System.out.print("Longest: ");
				System.out.println(list.get(0));
			}else {
				System.out.print("Longest: ");
				System.out.printf(result);
			}	
		}
	}
}
