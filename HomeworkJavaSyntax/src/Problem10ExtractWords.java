import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem10ExtractWords {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String input = scn.nextLine();
		
		Pattern pat = Pattern.compile("[a-zA-z]+");
		
		Matcher match = pat.matcher(input);

		while (match.find()) {
			
			System.out.printf("%s ", match.group(0));
		}
	}
}
