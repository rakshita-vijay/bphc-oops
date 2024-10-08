import java.util.Scanner;
import java.time.*;

public class Lab4XBook extends Lab4VLibraryItem implements Lab4WBorrowable {
  String author;
  boolean borrowed = false;

  // String borrower;
  // int yearBorrowed;

  Lab4VLibraryItem.BorrowingHistory borrowingHistory = new Lab4VLibraryItem.BorrowingHistory();

  public Lab4XBook(String title, int year, String author) {
    this.title = title;
    this.year = year;
    this.author = author;
  }

  @Override
  public void displayInfo(Lab4VLibraryItem libraryItem) {
    System.out.println("Book title: " + libraryItem.title + "\nYear of publishing: " + libraryItem.year + "\nAuthor name: " + this.author + "\nIs borrowed: " + isBorrowed(this) + ((isBorrowed(this) == true) ? ("\nYear Borrowed: " + borrowingHistory.yearBorrowed) : ("\nYear Returned: " + borrowingHistory.yearReturned)) + "\n");
  }

  @Override
  public void borrowItem(Lab4VLibraryItem libraryItem) {
    Scanner scan1 = new Scanner(System.in);

    if (isBorrowed(libraryItem) == true) {
      System.out.println("The book has been borrowed by someone else, please choose a different book :( \n");
    } else {
      this.borrowed = true;
      System.out.print("The book has been successfully borrowed by: ");
      // this.borrower = scan1.nextLine();
      borrowingHistory.borrower = scan1.nextLine();
      System.out.println();

      LocalDate currentdate = LocalDate.now();
      // this.yearBorrowed = currentdate.getYear();
      borrowingHistory.yearBorrowed = currentdate.getYear();
    }

    scan1.close();
  }

  public int givePenalty(int yearReturned, int yearBorrowed) {
    return ((yearReturned - yearBorrowed) * 10);
  }

  @Override
  public void returnItem(Lab4VLibraryItem libraryItem) {
    if (this.borrowed == true) {
      this.borrowed = false;
      System.out.println("Thank you for returning the book! \n");
      LocalDate yearReturned = LocalDate.now();

      // if ((yearBorrowed + 1) < yearReturned.getYear()) {
      if ((borrowingHistory.yearBorrowed + 1) < yearReturned.getYear()) {
        // int penalty = givePenalty(yearReturned.getYear(), yearBorrowed);
        int penalty = givePenalty(yearReturned.getYear(), borrowingHistory.yearBorrowed);
        System.out.println("You have a penalty of " + penalty + " dollars, pay at front desk");
      }
    } else {
      System.out.println("An unborrowed book cannot be returned, try again later");
    }
  }

  @Override
  public boolean isBorrowed(Lab4VLibraryItem libraryItem) {
    return (this.borrowed == true) ? true : false;
  }
}
