public class Lab4YMagazine extends Lab4VLibraryItem {
  int issueNumber;

  public Lab4YMagazine(String title, int year, int issueNumber) {
    this.title = title;
    this.year = year;
    this.issueNumber = issueNumber;
  }

  @Override
  void displayInfo(Lab4VLibraryItem libraryItem) {
    System.out.println("Magazine title: " + libraryItem.title + "\nYear of publishing: " + libraryItem.year + "\nIssue Number: " + this.issueNumber + "\n");
  }
}
