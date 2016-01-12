import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem12CardsFrequencies {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		
		String input = scn.nextLine();
			
		Map<String, Integer> map = new LinkedHashMap<>();
		
		Pattern pat = Pattern.compile("[A-Z0-9]+");
		Matcher match = pat.matcher(input);
		
		int len = 0;
		for (int i = 0; i < input.length(); i++) {

			while (match.find()) {
				
				if (map.containsKey(match.group(0))) {
					len++;
					map.put(match.group(0), map.get(match.group(0)) + 1);
				}else {
					len++;
					map.put(match.group(0), 1);
				}
			}
		}		
		float percentages = 0;
		for (Entry<String, Integer> s : map.entrySet()) {
			
			float value = s.getValue();
			percentages = ( value / len ) * 100;
			System.out.printf("%s -> %.2f%%", s.getKey(), percentages);
			System.out.println();	
		}
	}
}
