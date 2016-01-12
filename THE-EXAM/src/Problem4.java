import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);		
		String input = "";
		
		Map<String, Integer> totalErrors = new LinkedHashMap<>();
		Map<String, String> map = new LinkedHashMap<>();
		
		Pattern pat = Pattern.compile("\\[\"(.+)\"\\].+Type.+\\[\"(.+)\"\\].+Message.+\\[\"(.+)\"\\]");
		
		while (!input.equals("END")) {
			input = scn.nextLine();
			if (!input.equals("END")) {
				
				Matcher match = pat.matcher(input);
				while (match.find()) {
					
					if (totalErrors.containsKey(match.group(1))) {
						
						int integer = totalErrors.get(match.group(1));
						totalErrors.put(match.group(1), integer + 1);
					}else {
						
						totalErrors.put(match.group(1), 1);
					}
				
					String key = match.group(1) + "*" + match.group(2);
					if (map.containsKey(key)) {
						
						String str = map.get(key) + "*" + match.group(3);
						map.put(key, str);
					}else {
						
						map.put(key, match.group(3));
					}
				}
			}			
		}
		int crit = 0;
		int warn = 0;
		totalErrors = sortByValues(totalErrors);
		for (Entry<String, Integer> s : totalErrors.entrySet()) {
			
			System.out.println(s.getKey() + ":");
			System.out.println("Total Errors: " + s.getValue());
			
			for (Entry<String, String> ss : map.entrySet()) {
			
				if (ss.getKey().contains("Critical")) {
					crit++;	
				}
				if (ss.getKey().contains("Warning")) {
					warn++;
				}
			}
			
			System.out.printf("Critical: %d", crit);
			System.out.println();
			System.out.printf("Warnings: %d", warn);
			System.out.println();
			
			for (Entry<String, String> ss : map.entrySet()) {
				
				String[] arr = ss.getValue().replace("*", "~").split("~");
				
				if (ss.getKey().contains(s.getKey())) {
				
					if (ss.getKey().contains("Critical")) {
						System.out.println("Critical Messages:");

						
						for (int i = 0; i < arr.length; i++) {
							System.out.printf("--->%s", arr[i]);
							System.out.println();
						}
						
					}
					if (ss.getKey().contains("Warning")) {
						System.out.println("Warning Messages:");
					
						for (int i = 0; i < arr.length; i++) {
							System.out.printf("--->%s", arr[i]);
							System.out.println();
						}
					}
				}
			}
			warn = 0;
			crit = 0;
			System.out.println();
		}	
		scn.close();
	}
	public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
	    Comparator<K> valueComparator =  new Comparator<K>() {
	        public int compare(K k1, K k2) {
	            int compare = map.get(k2).compareTo(map.get(k1));
	            if (compare == 0) return 1;
	            else return compare;
	        }
	    };
	    Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
	    sortedByValues.putAll(map);
	    return sortedByValues;
	}
}
