import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem11MostFrequentWord {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] input = scn.nextLine().toLowerCase().split(" ");

		for (int i = 0; i < input.length; i++) {
			
			input[i] = input[i].replaceAll("\\W+", "");
		}
		
		Map<String, Integer> map = new TreeMap<>();
		
		int count = 0;
		String a = "";
		String b = "";
		for (int i = 0; i < input.length; i++) {
			
			a = input[i];
			for (int j = 0; j < input.length; j++) {
			
				b = input[j];
				
				if (a.equals(b)) {
					
					count++;
					if (j == input.length - 1) {
						map.put(a, count);	
					}
				}else {
				
					map.put(a, count);			
				}
			}	
			count = 0;
		}	
		
		int maxValue = (Collections.max(map.values()));
		
        for (Entry<String, Integer> s : map.entrySet()) { 
        	
            if (s.getValue() == maxValue) {
            	
                System.out.print(s.getKey());
                System.out.printf(" -> %d times", s.getValue());
                System.out.println();
            }
        }
	}
}
