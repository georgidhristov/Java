import java.util.Scanner;
public class tuna01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		tuna02 tuna02Object = new tuna02();
		System.out.println("Enter name of first girl friend here: ");
		String temp = input.nextLine();
		tuna02Object.setName(temp);
		tuna02Object.saying();

	}

}
