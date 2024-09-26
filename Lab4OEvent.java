abstract class Lab4OEvent {
  String eventName;
  String eventDate;

  abstract double calculateCost();

  void printEventDetails() {
    System.out.println("Event name: " + eventName + "\nEvent Date: " + eventDate);
  }
}
