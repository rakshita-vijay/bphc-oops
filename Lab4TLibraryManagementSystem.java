public class Lab4TLibraryManagementSystem {
  public static void main(String[] args) {
    // Lab4XBook book1 = new Lab4XBook("AB", 2023, "Arvi");
    // book1.displayInfo(book1);
    // book1.borrowItem(book1);
    // System.out.println("Book borrowing status: " + book1.isBorrowed(book1) + "\n");
    // book1.returnItem(book1);
    // System.out.println("Book borrowing status: " + book1.isBorrowed(book1) + "\n");

    // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    // Lab4XBook book2 = new Lab4XBook("ABC", 2024, "RV");
    // book2.returnItem(book2);
    // System.out.println("Book borrowing status: " + book2.isBorrowed(book2) + "\n");

    // System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    Lab4YMagazine magazine1 = new Lab4YMagazine("XYZ", 2006, 6);
    magazine1.displayInfo(magazine1);

    Lab4ZDVD dvd1 = new Lab4ZDVD("Beatles", 1965, 35);
    dvd1.displayInfo(dvd1);
    dvd1.borrowItem(dvd1);
    System.out.println("DVD borrowing status: " + dvd1.isBorrowed(dvd1) + "\n");
    dvd1.returnItem(dvd1);
    System.out.println("DVD borrowing status: " + dvd1.isBorrowed(dvd1) + "\n");

    // Lab4ULibrary library = new Lab4ULibrary();
    // library.display(library);
  }
}
