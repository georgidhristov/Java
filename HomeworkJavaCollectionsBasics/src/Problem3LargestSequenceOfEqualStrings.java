import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] arr = scn.nextLine().split(" ");
	
		String largestSequence = "";
		
		List<String> list = new ArrayList<>();
		
		if (arr.length == 1) {
			
			System.out.println(arr[0]);
			
		}else {
			
			for (int i = 0; i < arr.length - 1; i++) {	
				
				if (arr[i].equals(arr[i + 1])) {
					
					largestSequence = largestSequence + arr[i] + " ";
				}else {
					largestSequence = largestSequence + arr[i];
					list.add(largestSequence);
					
					largestSequence = "";
				}
				if (i + 2 == arr.length) {
					
					largestSequence = largestSequence + arr[i + 1];
					list.add(largestSequence);
				}
			}
			String result = "";
			
			if (list.size() == 1) {
				
				result = list.get(0);
				
				System.out.println(result);
			}else {
				int count = 0;
				for (int i = 0; i < list.size() - 1; i++) {
					
					String chek = list.get(i);
					String chek2 = list.get(i + 1);
					
					if (chek.length() != chek2.length()) {
						count++;
					}
			
					if (chek.length() >= chek2.length()) {
						
						result = chek;
					}else {
						result = chek2;
					}
				}
				if (count == 0) {
					System.out.println(list.get(0));
				}else {
					System.out.println(result);
				}
			}
		}
	}
}
