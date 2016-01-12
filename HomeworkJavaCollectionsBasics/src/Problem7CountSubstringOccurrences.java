import java.util.Scanner;

public class Problem7CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] input = scn.nextLine().split(" ");
		
		String word = scn.nextLine();
		
		String str = "";
		
		int index = 0;
		
		int count = 0;
		
		int result = 0;
		
		for (int i = 0; i < input.length; i++) {
			
			str = input[i].toLowerCase();
			
			while(index != -1){
				
				index = str.indexOf(word, count);
				count = index;
				count++;
				
				if (index != -1) {
					
					result++;
				}
			}
			index = 0;
			count = 0;
		}
		System.out.println(result);
	}
}
