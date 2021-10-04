import java.io.BufferedWriter;
import java.io.IOException;

public class TestApp{

public static void whenWriteStringUsingBufferedWritter_thenCorrect() 
  throws IOException {
    String str = "Hello";
    BufferedWriter writer = new BufferedWriter(new FileWriter(test.txt));
    writer.write("Hello Hello");
    
    writer.close();
    System.out.println("Write complete");
}

public static void main(String []args) {
      System.out.println("Hello World");
      whenWriteStringUsingBufferedWritter_thenCorrect();
   }

}

