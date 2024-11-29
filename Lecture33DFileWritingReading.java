
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Lecture33DFileWritingReading {
  public static void main(String[] args) {
    Lecture33EPerson p1 = new Lecture33EPerson("John", 30, "Male");
    Lecture33EPerson p2 = new Lecture33EPerson("Rachel", 25, "Female");
    try {
      FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
      ObjectOutputStream o = new ObjectOutputStream(f);

      // Write objects to file
      o.writeObject(p1);
      o.writeObject(p2);

      o.close();
      f.close();

      FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
      ObjectInputStream oi = new ObjectInputStream(fi);

      // Read objects
      Lecture33EPerson pr1 = (Lecture33EPerson) oi.readObject(); // reads line by line
      Lecture33EPerson pr2 = (Lecture33EPerson) oi.readObject(); // casting has to be done, else java cannot map it

      System.out.println(pr1.toString());
      System.out.println(pr2.toString());

      oi.close();
      fi.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("File not found");
    } catch (IOException e) {
      System.out.println("Error initializing stream");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
