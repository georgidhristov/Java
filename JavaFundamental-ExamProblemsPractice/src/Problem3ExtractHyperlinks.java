import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem3ExtractHyperlinks {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String input = scn.nextLine();
		
		Pattern pat = Pattern.compile("<a.*\\n*.*href\\s*=\\s*\\n*\"([^\"]+)\"|<a.*\\n*.*href\\s*=\\s*\\n*'([^']+)'|<a.*\\n*.*href\\s*=\\s*\\n*(\\/[^>]+)>|<a.*\\n*.*href\\s*=\\s*\\n*(http:\\/+.+)");
		
		String text = "";
		while (!input.equals("END")) {
			if (!input.equals("END")) {
				
				text = text + input + "\n";
			}
			input = scn.nextLine();
		}
		
		Matcher match = pat.matcher(text);
		while (match.find()) {
			
			if (match.group(1) != null) {
				System.out.println(match.group(1));
				
			}if (match.group(2)!= null) {
				System.out.println(match.group(2));
				
			}if (match.group(3) != null) {
				System.out.println(match.group(3));
				
			}if (match.group(4) != null) {
				System.out.println(match.group(4));
			}		
		}
		scn.close();
	}
}
