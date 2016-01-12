import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Problem3CountCharacterTypes {

	public static void main(String[] args)throws IOException {
	 
        int a = 0, b = 0, c = 0, symbol = 0;
        
        String firstSymbols = "aeiou";
		
        String secondSymbols = "!.,?";
        
        FileInputStream fis = new FileInputStream(new File("C:/Users/Georgi/Documents/Eclipse JavaProjects/HomeworkStreamsAndFiles/src/Prob3words.txt"));
        FileWriter fos = new FileWriter(new File("C:/Users/Georgi/Documents/Eclipse JavaProjects/HomeworkStreamsAndFiles/src/count-chars.txt"));
          
        while((symbol = fis.read())!=-1)
        {
            char ch = (char)symbol;
           
            if(firstSymbols.contains(ch+"")){
             
            	b++;
            }else if(secondSymbols.contains(ch+"")){
               
            	c++;
            }else if(Character.isLetter(ch)){

            	a++;
            }
        }
        fos.write(String.format("Vowels: %d%n",b));
        fos.write(String.format("Consonants: %d%n",a));
        fos.write(String.format("Punctuation: %d%n",c));
        fis.close();
        fos.close();
	}
}
