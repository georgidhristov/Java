import java.util.Scanner;

public class Problem2WeirdScript {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = Integer.parseInt(scn.nextLine());
		String key = "";
		if (n >= 1 && n <= 26) {
			
			key = key + (char) (n + 96);
		}else if (n >= 27 && n <= 52) {
			
			key = key + (char) (n + 38);
		}else if (n >= 53 && n <= 78) {
			
			key = key + (char) (n + 44);
		}else if (n >= 79 && n <= 104) {
			
			key = key + (char) (n - 14);
		}		
		key = key + key;
	
		scn.close();
	}
}
