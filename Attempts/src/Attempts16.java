
public class Attempts16 {
	public static void main(String[] args) {
		//Arrays in Methods.
		
		int joro[] = {3, 4, 5, 6, 7};
		change(joro);
		
		for (int y : joro) {
			System.out.println(y);
		}
			
	}
	
	public static void change(int x[]) {
		for (int i = 0; i < x.length; i++) {
			x[i] += 5;
		}
	}
}
