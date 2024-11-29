import java.io.*;

public class Lecture32ACharacterFile {
  public static void main(String[] args) throws IOException {
    FileReader sourceStream = null;
    PrintWriter destinationStream = null;

    try {
      sourceStream = new FileReader("Circle.java");
      destinationStream = new PrintWriter("CopiedTest.txt");
      // Reading sourcefile and writing content to target file character by character
      int temp;
      while ((temp = sourceStream.read()) != -1){
        System.out.print((char) temp);
        destinationStream.write(temp);
      }
    } finally {
      // Closing stream as no longer in use
      if (sourceStream != null)
        sourceStream.close();
      if (destinationStream != null)
        destinationStream.close();
    }
  }
}
