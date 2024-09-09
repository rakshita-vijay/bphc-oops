public class Lab4GRectangle extends Lab4EShape {
  public double length;
  public double width;

  public Lab4GRectangle(String shapeName, String color, double length, double width) {
    super();
    this.length = length;
    this.width = width;
  }

  double calculateArea() {
    return (length * width);
  }

  @Override
  public void displayDetails(String shapeName, String color) {
    System.out.println("Name: " + shapeName + "\nColor: " + color + "\nLength: " + this.length + "\nWidth: " + this.width + "\nArea: " + calculateArea() + "\n");
  }
}
