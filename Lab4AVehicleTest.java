import java.util.Scanner;

public class Lab4AVehicleTest {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    Lab4CCar car1;
    System.out.print("Enter the make of the car: ");
    String make = scan.nextLine();

    System.out.print("Enter the model of the car: ");
    String model = scan.nextLine();

    System.out.print("Enter the year the car was made in: ");
    int year = scan.nextInt();

    System.out.print("Enter the number of doors in the car: ");
    int numDoors = scan.nextInt();

    car1 = new Lab4CCar(make, model, year, numDoors);

    System.out.println();
    car1.displayDetails();

    scan.close();
  }
}
