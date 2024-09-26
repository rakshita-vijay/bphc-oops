import java.util.Scanner;
import java.time.*;

public class Lab4XBook extends Lab4ULibraryItem implements Lab4VBorrowable {
  String author;
  boolean borrowed = false;
  String borrower;
  int yearBorrowed;

  public Lab4XBook(String title, int year, String author) {
    this.title = title;
    this.year = year;
    this.author = author;
  }

  @Override
  public void displayInfo(Lab4XBook book) {
    System.out.println("Book title: " + book.title + "\nYear of publishing: " + book.year + "\nAuthor name: " + book.author + "\nIs borrowed: " + isBorrowed(book) + "\n");
  }

  @Override
  public void borrowItem(Lab4XBook book) {
    Scanner scan1 = new Scanner(System.in);

    if (isBorrowed(book) == true) {
      System.out.println("The book has been borrowed by someone else, please choose a different book :( \n");
    } else {
      this.borrowed = true;
      System.out.print("The book has been successfully borrowed by: ");
      this.borrower = scan1.nextLine();
      // System.out.print("The book has been successfully borrowed by " + this.borrower);
      System.out.println();

      LocalDate currentdate = LocalDate.now();
      this.yearBorrowed = currentdate.getYear();
    }

    scan1.close();
  }

  public int givePenalty(int currentYear, int yearBorrowed) {
    return ((currentYear - yearBorrowed) * 10);
  }

  @Override
  public void returnItem(Lab4XBook book) {
    // Scanner scan2 = new Scanner(System.in);

    // System.out.println("~");
    // System.out.printf("Who is trying to return a book? ");
    // System.out.println("~");
    // String returnPerson = scan2.nextLine();

    // if (returnPerson == this.borrower && this.borrowed == true) {
    if (this.borrowed == true) {
      this.borrowed = false;
      System.out.println("Thank you for returning the book! \n");
      LocalDate currentdate = LocalDate.now();

      if ((yearBorrowed + 1) < currentdate.getYear()) {
        int penalty = givePenalty(currentdate.getYear(), yearBorrowed);
        System.out.println("You have a penalty of " + penalty + " dollars, pay at front desk");
      }
    } else {
      System.out.println("An unborrowed book cannot be returned, try again later");
    }

    // scan2.close();
  }

  @Override
  public boolean isBorrowed(Lab4XBook book) {
    return (this.borrowed == true) ? true : false;
  }
}
