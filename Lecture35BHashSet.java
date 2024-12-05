import java.util.*;

public class Lecture35BHashSet {
  public static void main(String args[]) {
    HashSet<String> hs = new HashSet<String>(); // ordered, no repetition

    hs.add("BITS");
    hs.add("Pilani");
    hs.add("Hyderabad");
    hs.add("Campus");
    hs.add("Campus"); // Duplicate element - deleted by treeset, not hashset
    hs.add("is cool!");

    Iterator<String> itr = hs.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next().hashCode());
      // System.out.println(itr.next());
    }

    System.out.println("*******");

    hs.remove("Campus");

    itr = hs.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}

// BITS
// Campus
// Hyderabad
// Pilani
// is cool!

// BITS
// Hyderabad
// Pilani
// is cool!
