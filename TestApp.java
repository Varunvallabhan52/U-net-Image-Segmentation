import java.io.BufferedWriter;
import java.io.*;

public class TestApp{

public static void whenWriteStringUsingBufferedWritter_thenCorrect() 
  throws IOException {
    File file = new File("Hello1.txt");
      
      // creates the file
      file.createNewFile();
      
      // creates a FileWriter Object
      FileWriter writer = new FileWriter(file); 
      
      // Writes the content to the file
      writer.write("This\n is\n an\n example\n"); 
      writer.flush();
      writer.close();
      System.out.println("Write complete");
}

public static void main(String []args) {
      System.out.println("Hello World");
      try{
        whenWriteStringUsingBufferedWritter_thenCorrect();
      } catch (IOException e) {
        System.out.println(e);
      }
  
      
   }

}

