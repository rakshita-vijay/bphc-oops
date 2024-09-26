class Lab4PConference extends Lab4OEvent {
  int numAttendees;
  double costPerAttendee;

  double calculateCost() {
    return (numAttendees * costPerAttendee);
  }

  @Override
  void printEventDetails() {
    System.out.println("Event name: " + eventName + "\nEvent Date: " + eventDate + "\nNumber of Attendees: " + numAttendees + "\nTotal Cost: " + calculateCost());
  }
}
