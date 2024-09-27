import java.util.*;

public class Lab4ULibrary {
  List<Lab4VLibraryItem> libraryItems = new ArrayList<Lab4VLibraryItem>(); // https://www.w3schools.com/java/java_arraylist.asp

  public int search(String title) {
    for(int index = 0; index < libraryItems.size(); index++) { // https://www.geeksforgeeks.org/java-program-to-find-the-length-size-of-an-arraylist/
      if (libraryItems.get(index).title == title) { // https://www.geeksforgeeks.org/iterating-arraylists-java/
        return index;
      }
    }
    return -1;
  }

  public void display(Lab4VLibraryItem libraryItem) {
    for (int index = 0; index < libraryItems.size(); index++) {
      System.out.println(libraryItems.get(index));
    }
    System.out.println();
  }

  public class Librarian {
    public void add(Lab4VLibraryItem libraryItem) {
      libraryItems.add(libraryItem);
    }

    public void remove(String title) {
      int indexToRemove = search(title);
      libraryItems.remove(indexToRemove); // https://www.geeksforgeeks.org/remove-element-arraylist-java/
    }

    public void remove(Lab4VLibraryItem libraryItem) {
      int indexToRemove = search(libraryItem.title);
      libraryItems.remove(indexToRemove); // https://www.geeksforgeeks.org/remove-element-arraylist-java/
    }

    public void bookFunctions(Lab4XBook book, String func) {
      if(func.toLowerCase() == "borrow") {
        book.borrowItem(book);
      } else if(func.toLowerCase() == "return") {
        book.returnItem(book);
      }
    }

    public void dvdFunctions(Lab4ZDVD dvd, String func) {
      if (func.toLowerCase() == "borrow") {
        dvd.borrowItem(dvd);
      } else if (func.toLowerCase() == "return") {
        dvd.returnItem(dvd);
      }
    }
  }
}
