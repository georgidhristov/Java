import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem4CopyJpgFile {

	 public static void main(String[] args) throws IOException {
	  
		 FileInputStream fis = new FileInputStream("C:/Users/Georgi/Documents/Eclipse JavaProjects/HomeworkStreamsAndFiles/src/black-white-lion.jpg");
	     FileOutputStream fos = new FileOutputStream("C:/Users/Georgi/Documents/Eclipse JavaProjects/HomeworkStreamsAndFiles/src/my-copied-picture.jpg");
	        
	     int container;
	        
	     while((container = fis.read())!=-1)
	     {
	        fos.write(container);
	     }
	        
	     fis.close();
	     fos.close();
	 }	 	
}
