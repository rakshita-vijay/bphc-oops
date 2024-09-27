import java.time.LocalDate;
import java.util.Scanner;

public class Lab4ZDVD extends Lab4VLibraryItem implements Lab4WBorrowable {
  int duration;
  boolean borrowed = false;

  // String borrower;
  // int yearBorrowed;


  Lab4VLibraryItem.BorrowingHistory borrowingHistory = new Lab4VLibraryItem.BorrowingHistory();

  public Lab4ZDVD(String title, int year, int duration) {
    this.title = title;
    this.year = year;
    this.duration = duration;
  }

  @Override
  void displayInfo(Lab4VLibraryItem libraryItem) {
    System.out.println("DVD title: " + libraryItem.title + "\nYear of release: " + libraryItem.year + "\nDuration: " + this.duration + "\nIs borrowed: " + isBorrowed(this) + ((isBorrowed(this) == true) ? ("\nYear Borrowed: " + borrowingHistory.yearBorrowed) : ("\nYear Returned: " + borrowingHistory.yearReturned)) + "\n");
  }

  @Override
  public void borrowItem(Lab4VLibraryItem libraryItem) {
    Scanner scan1 = new Scanner(System.in);

    if (isBorrowed(libraryItem) == true) {
      System.out.println("The DVD has been borrowed by someone else, please choose a different DVD :( \n");
    } else {
      this.borrowed = true;
      System.out.print("The DVD has been successfully borrowed by: ");
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
      System.out.println("Thank you for returning the DVD! \n");
      LocalDate yearReturned = LocalDate.now();

      // if ((yearBorrowed + 1) < yearReturned.getYear()) {
      if ((borrowingHistory.yearBorrowed + 1) < yearReturned.getYear()) {
        // int penalty = givePenalty(yearReturned.getYear(), yearBorrowed);
        int penalty = givePenalty(yearReturned.getYear(), borrowingHistory.yearBorrowed);
        System.out.println("You have a penalty of " + penalty + " dollars, pay at front desk");
      }
    } else {
      System.out.println("An unborrowed DVD cannot be returned, try again later");
    }
  }

  @Override
  public boolean isBorrowed(Lab4VLibraryItem libraryItem) {
    return (this.borrowed == true) ? true : false;
  }
}
