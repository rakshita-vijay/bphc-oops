public abstract class Lab4VLibraryItem {
  String title;
  int year;

  abstract void displayInfo(Lab4VLibraryItem libraryItem);

  public class BorrowingHistory {
    String borrower;
    int yearBorrowed;
    int yearReturned;
  }
}
