import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1Enigma {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int lines = Integer.parseInt(scn.nextLine());

		String input = null;
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0; i < lines; i++) {
			
			input = scn.nextLine();
			
			list.add(input);
		}
		
		AsciiCharacterMethod(list);
	}
	
	public static void AsciiCharacterMethod(List<String> list) {
		
		List<String> result = new ArrayList<>();


		for (int i = 0; i < list.size(); i++) {
	 		String withoutSpaces  = list.get(i).replace(" ", "");
			withoutSpaces = withoutSpaces.replaceAll("[0-9]","");

			int len = withoutSpaces.length() / 2;
			
			String str = list.get(i);
			
			char[] arr = str.toCharArray();
			
			String string = "";
			
			int ascii = 0;
			for (int j = 0; j < arr.length; j++) {
				
				ascii = arr[j];
				if (ascii != 32 ) {
					if (ascii > 57 || ascii < 48) {
						ascii = arr[j] + len;
						
						string = string + (char)ascii;
						
					}else if (ascii <= 57 && ascii >= 48) {
						
						string = string + (char)ascii;
					}
				}else {
					
					string = string + " ";
				}
			}
			System.out.println(string);
		}
	}
}
