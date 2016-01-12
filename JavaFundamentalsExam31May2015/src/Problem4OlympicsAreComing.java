import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Problem4OlympicsAreComing {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String input = "";

		Map<String, String> map = new LinkedHashMap<>();
		Pattern pat = Pattern.compile("(.+)\\|(.+)");

		while (!input.equals("report")) {
			input = scn.nextLine().replaceAll("\\s+", "");
			if (!input.equals("report")) {
				
				Matcher match = pat.matcher(input);
				while (match.find()) {
				
					if (map.containsKey(match.group(2))) {

						map.put(match.group(2), map.get(match.group(2)) + " " + match.group(1));
					}else {
						
						map.put(match.group(2), match.group(1));
					}
				}
			}
		}
		Map<String, Integer> result = new LinkedHashMap<>();
		
		for (Entry<String, String> s : map.entrySet()) {
			
			String[] stringArr = s.getValue().split(" ");
			int wins = stringArr.length;			
			String str = s.getValue();
			str = removeDuplicates(str, " ");
			str = str.replace("-", " ");
			String[] strArr = str.split(" ");
			int participants = strArr.length;
			
			String res = s.getKey() + " (" 
					 + participants + " " 
					 + "participants" + "): ";
			
			result.put(res, wins);
		}
		
		result = sortByValues(result);
		
		for (Entry<String, Integer> s : result.entrySet()) {
			
			System.out.print(s.getKey());
			System.out.println(s.getValue() + " wins");
		}
		scn.close();
	}
	public static String removeDuplicates(String txt, String splitterRegex)
	{
	    List<String> values = new ArrayList<String>();
	    String[] splitted = txt.split(splitterRegex);
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < splitted.length; ++i)
	    {
	        if (!values.contains(splitted[i]))
	        {
	            values.add(splitted[i]);
	            sb.append('-');
	            sb.append(splitted[i]);
	        }
	    }
	    return sb.substring(1);
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
