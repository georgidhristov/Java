import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem11StartsAndEndsWithCapitalLetter {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String input = scn.nextLine();

		Pattern pat = Pattern.compile("\\b[A-Z]([A-z]+)?[A-Z]\\b");
		
		Matcher match = pat.matcher(input);
		
		while (match.find()) {
			
			System.out.print(match.group(0) + " ");
		}
	}
}
