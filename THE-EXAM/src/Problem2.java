import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String input = scn.nextLine();
		
		Pattern pat = Pattern.compile("([A-Z][a-z]+).*?([A-Z][a-z]*[A-Z]).*?(\\d+L)");
		
		double liters = 0;
		
		while (!input.equals("OK KoftiShans")) {
			if (!input.equals("OK KoftiShans")) {

				Matcher match = pat.matcher(input);
				while (match.find()) {
					
					liters = liters + Integer.parseInt(match.group(3).replace("L", ""));
						
					System.out.printf("%s brought %s liters of %s!", 
							match.group(1),
							match.group(3).replace("L", ""),
							match.group(2).toLowerCase());
					System.out.println();
				}
			}
			input = scn.nextLine();
		}
		
		double softuni = liters / 1_000;
		System.out.printf("%.3f softuni liters", softuni);
		scn.close();
	}
}
