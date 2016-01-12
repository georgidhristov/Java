import java.util.Scanner;
import java.util.TreeSet;

public class Problem10ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] input = scn.nextLine().split(" ");
				
		TreeSet<String> ts = new TreeSet<>();
		
		for (int i = 0; i < input.length; i++) {
			
			ts.add(input[i].toLowerCase().replaceAll("\\W+", ""));
		}
		
		for (String string : ts) {
			
			System.out.printf("%s ", string);
		}
	}
}
