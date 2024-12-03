import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Lab13BWriterReaderArrayListHashMap {
  public static void main(String[] args) {
    Lab13APersonHashMap p1 = new Lab13APersonHashMap("John", 30, "Male");
    Lab13APersonHashMap p2 = new Lab13APersonHashMap("Rachel", 25, "Female");

    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myObjects.txt"))) {
      oos.writeObject(p1);
      oos.writeObject(p2);
    } catch (IOException e) {
      System.out.println("Error writing to file: " + e.getMessage());
      return;
    }

    // Step 2: Read objects from the file and store them in ArrayList and HashMap
    ArrayList<Lab13APersonHashMap> personList = new ArrayList<>();
    HashMap<String, Lab13APersonHashMap> personMap = new HashMap<>();

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myObjects.txt"))) {
      while (true) {
        try {
          Lab13APersonHashMap person = (Lab13APersonHashMap) ois.readObject();
          personList.add(person);
          personMap.put(person.getName(), person);
        } catch (EOFException e) {
          break; // End of file reached
        }
      }
    } catch (IOException | ClassNotFoundException e) {
      System.out.println("Error reading from file: " + e.getMessage());
    }

    // Display the collections
    System.out.println("ArrayList of Persons:");
    for (Lab13APersonHashMap person : personList) {
      System.out.println(person);
    }

    System.out.println("\nHashMap of Persons:");
    for (String key : personMap.keySet()) {
      System.out.println("Key: " + key + ", Value: " + personMap.get(key));
    }
    System.out.println("~~~~~~");
    for (Lab13APersonHashMap pers : personMap.values()) {
      System.out.println(pers);
    }
    System.out.println("~~~~~~");

    // Step 3: Search for objects and perform queries
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nEnter the name of the person to search:");
    String searchName = scanner.nextLine();

    // Search in HashMap
    if (personMap.containsKey(searchName)) {
      System.out.println("Found in HashMap: " + personMap.get(searchName));
    } else {
      System.out.println(searchName + " not found in HashMap.");
    }

    // Search in ArrayList
    boolean found = false;
    for (Lab13APersonHashMap person : personList) {
      if (person.getName().equalsIgnoreCase(searchName)) {
        System.out.println("Found in ArrayList: " + person);
        found = true;
        break;
      }
    }
    if (!found) {
      System.out.println(searchName + " not found in ArrayList.");
    }

    scanner.close();
  }
}
