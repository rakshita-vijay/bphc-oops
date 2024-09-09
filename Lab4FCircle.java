import java.lang.Math;

public class Lab4FCircle extends Lab4EShape {
  public double radius;

  public Lab4FCircle(String shapeName, String color, double radius) {
    super();
    this.radius = radius;
  }

  double calculateArea() {
    return (Math.PI * this.radius * this.radius);
  }

  @Override
  public void displayDetails(String shapeName, String color) {
    System.out.println("Name: " + shapeName + "\nColor: " + color + "\nRadius: " + this.radius + "\nArea: " + calculateArea() + "\n");
  }
}
