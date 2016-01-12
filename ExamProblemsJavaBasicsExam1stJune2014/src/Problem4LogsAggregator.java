import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem4LogsAggregator {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = Integer.parseInt(scn.nextLine());		
		
		String input = null;
		
		Map<String, String> userAndIp = new TreeMap<>();
		Map<String, Integer> userAndDuration = new TreeMap<>();
		
		Pattern pat = Pattern.compile("([0-9\\.]+)\\s+([A-Za-z]+)\\s+([0-9]+)");

		for (int i = 0; i < n; i++) {
			input  = scn.nextLine();
			
			Matcher match = pat.matcher(input);
			while (match.find()) {

				if (!userAndIp.containsKey(match.group(2))) {

					userAndIp.put(match.group(2), match.group(1));
					userAndDuration.put(match.group(2), Integer.parseInt(match.group(3)));
				}else {
					
					for (Entry<String, String> s : userAndIp.entrySet()) {
						if (!s.getValue().contains(match.group(1))) {
							if (s.getKey().equals(match.group(2))) {
								
								List<String> list = new ArrayList<>();
								list.add(s.getValue());
								list.add(match.group(1));
						
								Collections.sort(list);
								String str = list.toString();
								list.clear();
								
								str = str.replaceAll("[\\[\\]]", "");
								
								userAndIp.put(match.group(2), str);
							}
						}
					}
					for (Entry<String, Integer> s : userAndDuration.entrySet()) {
						if (s.getKey().equals(match.group(2))) {
							
							userAndDuration.put(match.group(2), s.getValue() + Integer.parseInt(match.group(3)));
						}	
					}
				}
			}
		}
		
		for (Entry<String, String> ss : userAndIp.entrySet()) {
			
			System.out.printf("%s: ", ss.getKey());
			
			System.out.printf("%s ", userAndDuration.get(ss.getKey()));	
			
			System.out.print("[");
			System.out.printf(String.join(", ", ss.getValue()));
			System.out.print("]");
			System.out.println();
		}	
	}
}


