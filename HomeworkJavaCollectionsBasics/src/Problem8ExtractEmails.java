import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem8ExtractEmails {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String input = scn.nextLine();
		
		Pattern pat = Pattern.compile("((?<!@)[@A-Za-z\\.]+(?<=@)[@a-zA-Z]*[.]*[A-Za-z]*[.]*[A-Za-z]+)");
		
		Matcher match = pat.matcher(input);
		
		while (match.find()) {
			
			System.out.println(match.group(1));
		}
	}
}
