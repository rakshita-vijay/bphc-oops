// Byte Stream sample

import java.io.*;

public class Lecture31AByteStream {
  public static void main(String[] args) throws IOException {
    FileInputStream sourceStream = null;
    FileOutputStream targetStream = null;
    long byteCount = 0;

    try {
      sourceStream = new FileInputStream("alanturing.webp");
      targetStream = new FileOutputStream("fatherOfAI.webp");

      int temp;
      while ((temp = sourceStream.read()) != -1) {
        targetStream.write((byte) temp);
        byteCount++;
        if ((byteCount % 1024) == 0) {
          System.out.println("Copied " + byteCount + " bytes");
        }
      }
      finally {
        if (sourceStream != null)
          sourceStream.close();
        if (targetStream != null)
          targetStream.close();
      }
    }
  }
}
