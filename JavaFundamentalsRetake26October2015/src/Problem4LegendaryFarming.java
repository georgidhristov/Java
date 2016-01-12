import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem4LegendaryFarming {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Map<String, Integer> map = new TreeMap<>();
		
		Pattern pat = Pattern.compile("(\\d+)\\s+([A-z-]+)");
		
		int shards = 0;
		int fragments = 0;
		int motes = 0;
		boolean bool = false;
		
		String item = "";
		while (item.equals("")) {
			String input = scn.nextLine().toLowerCase();
			
			Matcher match = pat.matcher(input);
			while (match.find()) {
				
				if (match.group(2).equals("shards")) {
					
					shards = shards + Integer.parseInt(match.group(1));
				}else if (match.group(2).equals("fragments")) {
					
					fragments = fragments + Integer.parseInt(match.group(1));
				}else if (match.group(2).equals("motes")) {
					
					motes = motes + Integer.parseInt(match.group(1));
				}
				
				if (shards >= 250 || fragments >= 250 || motes >= 250) {
					if (match.group(2).equals("shards")) {
						
						bool = true;
						item = "Shadowmourne obtained!";
						System.out.println(item);
					}else if (match.group(2).equals("fragments")) {
						
						bool = true;
						item = "Valanyr obtained!";
						System.out.println(item);
					}else if (match.group(2).equals("motes")) {
						
						bool = true;
						item = "Dragonwrath obtained!";
						System.out.println(item);
					}
					
				}
				
				if (map.containsKey(match.group(2))) {

					if (!match.group(2).equals("shards") 
						&& !match.group(2).equals("fragments")
						&& !match.group(2).equals("motes")) {
						
						int integer = map.get(match.group(2));
						map.put(match.group(2), integer + Integer.parseInt(match.group(1)));	
					}
					
				}else {
					
					if (!match.group(2).equals("shards") 
						&& !match.group(2).equals("fragments")
						&& !match.group(2).equals("motes")) {
						
						map.put(match.group(2),Integer.parseInt(match.group(1)));	
					}
				}
					
				if (bool == true) {
					break;
				}
			}
		}
		
		if (item.equals("Valanyr obtained!")) {
			fragments = fragments - 250;
			
		}else if (item.equals("Shadowmourne obtained!")) {
			
			shards = shards - 250;
		}else if (item.equals("Dragonwrath obtained!")) {
			
			motes = motes - 250;
		}
		
		if (fragments >= shards && fragments >= motes) {
			
			System.out.println("fragments: " + fragments);
			if (motes >= shards) {
				
				System.out.println("motes: " + motes);
				System.out.println("shards: " + shards);
			}else {
				
				System.out.println("shards: " + shards);
				System.out.println("motes: " + motes);
			}
		}else if (motes >= shards && motes >= fragments) {
			
			System.out.println("motes: " + motes);
			if (fragments >= shards) {
				
				System.out.println("fragments: " + fragments);
				System.out.println("shards: " + shards);
			}else {
				
				System.out.println("shards: " + shards);
				System.out.println("fragments: " + fragments);
			}
		}else {			
			System.out.println("shards: " + shards);
			
			if (fragments >= motes) {
				
				System.out.println("fragments: " + fragments);
				System.out.println("motes: " + motes);
			}else {
				
				System.out.println("motes: " + motes);
				System.out.println("fragments: " + fragments);
			}
		}

		for (Entry<String, Integer> s : map.entrySet()) {
			
			System.out.print(s.getKey() + ": ");
			System.out.println(s.getValue());
		}
		scn.close();
	}
}
