import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1DragonSharp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int numberOfLines = scn.nextInt();
		
		String input = null;

		List<String> list = new ArrayList<>();
		
		for (int i = 0; i <= numberOfLines; i++) {
			
			input = scn.nextLine();
			
			list.add(input);
		}	
		DragonSharpMethod(list);
	}
	
	public static void DragonSharpMethod(List<String> list) {
		
		int count = 0;
		for (int i = 1; i < list.size(); i++) {
			String str = list.get(i);
			
			if (str.contains(";") && str.contains("\"") && str.contains("\"")) {
				continue;
			}else {
				System.out.printf("Compile time error @ line %s", i);
				count = 1;
			}
		}
		
		if (count == 0) {
			
			for (int i = 1; i < list.size() - 1; i++) {
				String str = list.get(i);
				String strPlusOne = list.get(i + 1);	

				if (str.contains(";") && str.contains("\"") && str.contains("\"")) {
					
					Pattern pattern = Pattern.compile("\\((\\d+)(\\D+)(\\d+)\\)[A-Za-z\\s0-9]+(?=\\\"(.+)\\\")");
					Pattern patTimes = Pattern.compile("loop\\s+(\\d+)");
					
					Matcher matchPattern = pattern.matcher(str);
					Matcher matchTimes = patTimes.matcher(str);
					
					//-------------------------------------
					
					Pattern pattern2 = Pattern.compile("\"(.+)\"");
					Pattern patTimes2 = Pattern.compile("else\\s+loop\\s+(\\d+)");
					
					Matcher matchPattern2 = pattern2.matcher(strPlusOne);
					Matcher matchTimes2 = patTimes2.matcher(strPlusOne);
					
					while (matchPattern.find()) {
						if (str.contains("if")) {
							if (matchPattern.group(2).equals("==")) {
								if (matchPattern.group(1).equals(matchPattern.group(3))) {
									if (str.contains("loop")) {
										while (matchTimes.find()) {
											int times = Integer.parseInt(matchTimes.group(1));	
											for (int j = 0; j < times; j++) {
												System.out.println(matchPattern.group(4));
											}
										}
									}else {
										System.out.println(matchPattern.group(4));
									}	
								}else {
									if (strPlusOne.contains("else")) {
										while (matchPattern2.find()) {
											if (strPlusOne.contains("loop")) {
												while (matchTimes2.find()) {
													int times = Integer.parseInt(matchTimes2.group(1));	
													for (int j = 0; j < times; j++) {
														System.out.println(matchPattern2.group(1));
													}
												}
											}else {
												System.out.println(matchPattern2.group(1));
											}
										}
									}else {
										continue;
									}
								}
							}
						}
						if (str.contains("if")) {
							if (matchPattern.group(2).equals("<")) {
								if (Integer.parseInt(matchPattern.group(1)) < Integer.parseInt(matchPattern.group(3))) {
									if (str.contains("loop")) {
										while (matchTimes.find()) {
											int times = Integer.parseInt(matchTimes.group(1));	
											for (int j = 0; j < times; j++) {
												System.out.println(matchPattern.group(4));
											}
										}
									}else {
										System.out.println(matchPattern.group(4));
									}								
								}else {
									if (strPlusOne.contains("else")) {
										while (matchPattern2.find()) {
											if (strPlusOne.contains("loop")) {
												while (matchTimes2.find()) {
													int times = Integer.parseInt(matchTimes2.group(1));	
													for (int j = 0; j < times; j++) {
														System.out.println(matchPattern2.group(1));
													}
												}
											}else {
												System.out.println(matchPattern2.group(1));
											}
										}
									}else {
										continue;
									}
								}
							}
						}
						if (str.contains("if")) {
							if (matchPattern.group(2).equals(">")) {
								if (Integer.parseInt(matchPattern.group(1)) > Integer.parseInt(matchPattern.group(3))) {
									if (str.contains("loop")) {
										while (matchTimes.find()) {
											int times = Integer.parseInt(matchTimes.group(1));	
											for (int j = 0; j < times; j++) {
												System.out.println(matchPattern.group(4));
											}
										}
									}else {
										System.out.println(matchPattern.group(4));
									}
								}else {
									if (strPlusOne.contains("else")) {
										while (matchPattern2.find()) {
											if (strPlusOne.contains("loop")) {
												while (matchTimes2.find()) {
													int times = Integer.parseInt(matchTimes2.group(1));	
													for (int j = 0; j < times; j++) {
														System.out.println(matchPattern2.group(1));
													}
												}
											}else {
												System.out.println(matchPattern2.group(1));
											}
										}
									}else {
										continue;
									}
								}
							}
						}			  
					}		
				}
			}
		}
	}
}
