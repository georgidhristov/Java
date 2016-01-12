import java.util.Scanner;

public class Problem8GetAverage {

	public static void main(String[] args) {
		Scanner readLine = new Scanner(System.in);
		double a = Double.parseDouble(readLine.nextLine());
		double b = Double.parseDouble(readLine.nextLine());
		double c = Double.parseDouble(readLine.nextLine());

		double result = averageMethod(a,b,c);
		
		System.out.println(String.format("%.2f",result));
	}
	public static double averageMethod(double a,double b, double c) {
		double average = (a + b + c) / 3;		
		return average;
	}
}
