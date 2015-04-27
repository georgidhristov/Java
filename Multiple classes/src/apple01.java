import java.util.Scanner;
public class apple01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		apple02 apple02Object = new apple02();
		
		System.out.println("Enter your name here :");
		String name = input.nextLine();
		
		apple02Object.simpleMessage(name);
	}

}
