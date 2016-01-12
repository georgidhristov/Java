import java.util.Scanner;

public class Problem2TriangleArea {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int aX = scn.nextInt();
		int aY = scn.nextInt();
		int bX = scn.nextInt();
		int bY = scn.nextInt();
		int cX = scn.nextInt();
		int cY = scn.nextInt();
		int area = 0;
		
		area = aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY);
		area = area / 2;
		
		System.out.println(Math.abs(area));
	}

}
