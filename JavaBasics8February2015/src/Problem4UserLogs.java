import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem4UserLogs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Map<String, String> map = new TreeMap<>();
		
		Pattern pat = Pattern.compile("IP=(.+)\\s+message=.+\\s+user=(.+)");
		
		String input = scn.nextLine();
		
		while (!input.equals("end")) {
			if (!input.equals("end")) {
				
				Matcher match = pat.matcher(input);
				if (match.find()) {
					
					if (map.containsKey(match.group(2))) {

						map.put(match.group(2), map.get(match.group(2)) + " " + match.group(1));
					}else {
						
						map.put(match.group(2), match.group(1));
					}
				}
			}
			input = scn.nextLine();
		}
		
		int count = 1;
		String str = "";
		for (Entry<String, String> ss : map.entrySet()) {
			
			Map<String, Integer> map2 = new LinkedHashMap<>();
			
			String[] arr = ss.getValue().split(" ");

			System.out.println(ss.getKey() + ": ");
			
			for (int i = 0; i < arr.length; i++) {
				
				if (map2.containsKey(arr[i])) {
					count++;
					map2.put(arr[i], count);
				}else {
					count = 1;
					map2.put(arr[i], count);
				}
			}
			
			int coco = 0;
			for (Entry<String, Integer> si : map2.entrySet()) {
				
				coco++;
				System.out.print(si.getKey() + " => ");
				System.out.print(si.getValue());
				
				if (coco > 0 && coco < map2.size()) {
					System.out.print(", ");
				}
				
			}
			System.out.println(".");
		}
	}
}