public class Lab4QWedding extends Lab4OEvent {
  int numGuests;
  double venueCost;

  double calculateCost() {
    return ((numGuests * 50) + venueCost);
  }

  @Override
  void printEventDetails() {
    System.out.println("Event name: " + eventName + "\nEvent Date: " + eventDate + "\nNumber of Guests: " + numGuests + "\nTotal Cost: " + calculateCost());
  }
}
