import java.util.*;

public class Lab4DTestShapes {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Lab4FCircle circle;
    Lab4GRectangle rectangle;

    System.out.print("Enter the shape's name: ");
    String shapeName = scan.nextLine();
    System.out.print("Enter the shape's color: ");
    String color = scan.nextLine();

    switch (shapeName.toLowerCase()) {
      case "circle":
        System.out.print("Enter the shape's radius: ");
        double radius = scan.nextDouble();

        System.out.println();

        circle = new Lab4FCircle(shapeName, color, radius);
        circle.displayDetails(shapeName, color);
        break;
      case "rectangle":
        System.out.print("Enter the shape's length: ");
        double length = scan.nextDouble();
        System.out.print("Enter the shape's width: ");
        double width = scan.nextDouble();

        System.out.println();

        rectangle = new Lab4GRectangle(shapeName, color, length, width);
        rectangle.displayDetails(shapeName, color);
        break;
      default:
        System.out.println("You have not entered 'circle' or 'rectangle'. Exiting... ");
        break;
    }

    scan.close();
  }
}
