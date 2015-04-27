import java.util.Scanner;
public class Attempts06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0, grade, average, counter = 0;
		
		while (counter < 10) {
			grade = input.nextInt(); 
			total = total + grade;
			counter++;
		}
		average = total/10;
		System.out.println("your average is " + average);
	}
}
