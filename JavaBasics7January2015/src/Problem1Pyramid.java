import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem1Pyramid {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = Integer.parseInt(scn.nextLine());
		String input = null;
		
		List<Integer> result = new ArrayList<>();
		List<Integer> numbers = new ArrayList<>();
		
		int num = 0;
		int count =  0;
		for (int i = 0; i < n; i++) {
			input = scn.nextLine().trim().replaceAll("\\s+", " ");
			
			if (i == 0) {
				
				result.add(Integer.parseInt(input));
				num = Integer.parseInt(input);
			}else {
				
				String[] arr = input.split(" ");
				
				for (int j = 0; j < arr.length; j++) {
					
					if (num < Integer.parseInt(arr[j])) {	
						numbers.add(Integer.parseInt(arr[j]));
						count++;
					}
				}
				if (count == 0) {
					
					num = num + 1;
				}else {
					Collections.sort(numbers);
					result.add(numbers.get(0));
					num = numbers.get(0);
					count = 0;
					numbers.clear();
				}
				
			}
		}
		System.out.println(result.toString().replace("[", "").replace("]", ""));
	}
}
