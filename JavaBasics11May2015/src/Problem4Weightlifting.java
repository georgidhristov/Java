import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Problem4Weightlifting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = Integer.parseInt(scn.nextLine());
		String information = null;
		
		Map<String, Integer> player = new TreeMap<>();
		
		for (int i = 0; i < n; i++) {
			information = scn.nextLine();
		
			String[] arr = information.split(" ");
			
			if (player.containsKey(arr[0] + " " + arr[1])) {
				
				int sum = player.get(arr[0] + " " + arr[1]);
				player.put(arr[0] + " " + arr[1], sum + Integer.parseInt(arr[2]));
				
			}else {

				player.put(arr[0] + " " + arr[1], Integer.parseInt(arr[2]));
			}
		}
		
		List<String> list = new ArrayList<>();
		
		int count = 0;
		for (Entry<String, Integer> s : player.entrySet()) {
			
			String[] split = s.getKey().split(" ");
			
			if (list.contains(split[0])) {
				
				System.out.printf("%s - %d kg ", split[1], s.getValue());
				
			}else {
				
				if (count != 0) {
					
					System.out.println();
				}
				count = 1;
				
				System.out.printf("%s : ", split[0]);
				
				String res = s.getValue().toString();

				System.out.printf("%s - %s kg", split[1], String.join(", ", s.getValue().toString()));
				
			}
			
			list.add(split[0]);
		}
	}
}
