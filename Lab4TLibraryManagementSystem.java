public class Lab4TLibraryManagementSystem {
  public static void main(String[] args) {
    Lab4XBook book1 = new Lab4XBook("AB", 2023, "Arvi");
    book1.displayInfo(book1);
    book1.borrowItem(book1);
    book1.returnItem(book1);
    System.out.println("Book borrowing status: " + book1.isBorrowed(book1));

    Lab4XBook book2 = new Lab4XBook("ABC", 2024, "RV");
    book2.returnItem(book2);
  }
}
