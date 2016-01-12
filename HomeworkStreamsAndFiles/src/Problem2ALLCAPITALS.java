import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Problem2ALLCAPITALS {
	
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:/Users/Georgi/Documents/Eclipse JavaProjects/HomeworkStreamsAndFiles/src/Prob2lines.txt"));
       
        String txt = "";
        String str = "";

        while ((str = br.readLine()) != null) {
        	
        	txt = txt + str.toUpperCase() + "\r\n";
        }

        PrintWriter prw = new PrintWriter(new BufferedWriter(new FileWriter( "C:/Users/Georgi/Documents/Eclipse JavaProjects/HomeworkStreamsAndFiles/src/Prob2lines.txt")));
       
        prw.write(txt);
        prw.flush();
        br.close();
        prw.close();


	}
}
