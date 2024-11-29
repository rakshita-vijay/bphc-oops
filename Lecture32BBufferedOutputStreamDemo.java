import java.io.*;

class Lecture32BBufferedOutputStreamDemo {
  public static void main(String args[]) throws Exception {
    FileOutputStream fout = new FileOutputStream("f1.txt");
    BufferedOutputStream bout = new BufferedOutputStream(fout);
    long startTime = System.nanoTime();
    for(int i = 65; i < 75; i++) {
      bout.write(i);
      bout.flush();
    }
    long endTime = System.nanoTime();
    System.out.println("Time taken normally: " + (endTime - startTime));

    byte b[] = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74};
    long startTime1 = System.nanoTime();
    bout.write(b);
    bout.flush();
    long endTime1 = System.nanoTime();
    System.out.println("Time taken if buffer is written: " + (endTime1 - startTime1));

    bout.close();
    fout.close();
  }
}
