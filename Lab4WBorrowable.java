interface Lab4WBorrowable {
  void borrowItem(Lab4VLibraryItem libraryItem);
  void returnItem(Lab4VLibraryItem libraryItem);
  boolean isBorrowed(Lab4VLibraryItem libraryItem);
}
