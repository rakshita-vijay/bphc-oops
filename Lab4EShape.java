abstract class Lab4EShape {
  public String shapeName;
  public String color;

  abstract double calculateArea();
  // to be implemented by the derived classes for calculating the area of the
  // shape.

  public void displayDetails(String shapeName, String color) {
    System.out.println("Name: " + shapeName + "\nColor: " + color + "\nArea: " + calculateArea() + "\n");
  }
}
