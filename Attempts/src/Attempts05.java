
public class Attempts05 {

	public static void main(String[] args) {
		int age = 40;
		
		if (age < 40) {
			System.out.println("You are young .");
		}
		else{
			System.out.println("You are old .");
			
			if (age > 75) {
				System.out.println("You are really old .");
			}
			else{
				System.out.println("Dont worry you arent really that old .");
			}
		}
	}
}
