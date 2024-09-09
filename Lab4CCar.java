public class Lab4CCar extends Lab4BVehicle {
  public int numDoors;

  public Lab4CCar (String make, String model, int year, int numDoors) {
    super(make, model, year);
    this.numDoors = numDoors;
  }

  @Override
  public void displayDetails() {
    System.out.println("Make: " + this.make + "\nModel: " + this.model + "\nYear: " + this.year + "\nNumber of Doors: " + numDoors);
  }
}
