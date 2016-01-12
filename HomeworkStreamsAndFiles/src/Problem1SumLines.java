import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Problem1SumLines {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		 ArrayList<Integer> list = new ArrayList();
	        try(BufferedReader br = new BufferedReader( new FileReader("C:/Users/Georgi/Documents/Eclipse JavaProjects/HomeworkStreamsAndFiles/src/Prob1lines.txt")))
	        {

	            String line;
	            while((line = br.readLine())!=null) {
	                int sum = 0;
	                for (int i = 0; i < line.length(); i++) {
	                	sum = sum +line.charAt(i);
	                }
	                list.add(sum);

	            }
	        }
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println(list.get(i));
	        }
	}
}
