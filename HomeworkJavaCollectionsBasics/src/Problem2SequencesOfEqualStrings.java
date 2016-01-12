import java.util.Scanner;

public class Problem2SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] arr = scn.nextLine().split(" ");
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			if (arr[i].equals(arr[i + 1])) {
				
				System.out.printf("%s ",arr[i]);	
			}else {
				
				System.out.println(arr[i]);
			}
			
			if (i + 2 == arr.length) {
				
				System.out.println(arr[i + 1]);
			}
		}
	}
}
