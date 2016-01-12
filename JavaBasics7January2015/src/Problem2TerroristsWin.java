import java.lang.annotation.Repeatable;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2TerroristsWin {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String input = scn.nextLine();
		
		Pattern pat = Pattern.compile("\\|[A-z0-9]+\\|");
		
		int asciiSum = 0;

		
		Matcher match = pat.matcher(input);
		while (match.find()) {
			
			char[] charArr = match.group(0).replace("|", "").toCharArray();
			for (int i = 0; i < charArr.length; i++) {
				
				asciiSum = asciiSum + charArr[i];	
			}
			
			int bombRange = asciiSum % 10;
			asciiSum = 0;
		
			
		}
		System.out.println(input);
	}
	
	public static String repeat(String s, int times) {
	    if (times <= 0) return "";
	    else return s + repeat(s, times-1);
	}
	
	public static String replace(String str, int index, char replace){     
	    if(str==null){
	        return str;
	    }else if(index<0 || index>=str.length()){
	        return str;
	    }
	    char[] chars = str.toCharArray();
	    chars[index] = replace;
	    return String.valueOf(chars);       
	}
}
