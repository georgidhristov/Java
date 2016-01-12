import java.util.Scanner;

public class Problem13FilterArray {

	public static void main(String[] args) {
		Scanner scn =  new Scanner(System.in);
		
		String[] input = scn.nextLine().split(" ");
		
		String result = "";
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() > 4) {
				result = result + input[i] + " ";
			}else if (result.length() == 0) {
				result = "(empty)";
			}
		}
		System.out.println(result);
	}
}
