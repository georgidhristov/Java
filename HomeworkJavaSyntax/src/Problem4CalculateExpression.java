import java.util.Scanner;

public class Problem4CalculateExpression {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		double a = Double.parseDouble(scn.nextLine());
		double b = Double.parseDouble(scn.nextLine());
		double c = Double.parseDouble(scn.nextLine());


		double firstCalc = Math.pow((Math.pow(a, 2) 
				+ Math.pow(b, 2)) / ((Math.pow(a, 2) 
				- Math.pow(b, 2))),(a + b + c) 
				/ Math.sqrt(c));
				
		double secondCalc = Math.pow((Math.pow(a, 2) 
				+ Math.pow(b, 2) 
				- Math.pow(c, 2)), (a-b));
		
		double firstAverage = (a + b + c) / 3;
		
		double secondAverage = (firstCalc + secondCalc) / 2;
		
		double diff = firstAverage - secondAverage;
		
		System.out.printf(String.format("F1 result: %.2f; ", firstCalc));
		System.out.printf(String.format("F2 result: %.2f; ", secondCalc));
		System.out.printf(String.format("Diff: %.2f", Math.abs(diff)));
	}
}
