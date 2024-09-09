public class Lab4BVehicle {
  public String make;
  public String model;
  public int year;

  public Lab4BVehicle(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public void displayDetails() {
    System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nYear: " + this.year + "\n");
  }
}
