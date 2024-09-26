public class Lab4SCateredConference extends Lab4PConference implements Lab4RCaterable {
  String menu;
  double cateringCostPerPerson;

  public String getMenu() {
    return menu;
  }

  public void setMenu(String menu) {
    this.menu = menu;
  }

  public double calculateCateringCost() {
    return (numAttendees * cateringCostPerPerson);
  }

  @Override
  void printEventDetails() {
    System.out.println("Event name: " + eventName + "\nEvent Date: " + eventDate + "\nMenu: " + menu + "\nNumber of Attendees: " + numAttendees + "\nTotal Cost: " + calculateCateringCost());
  }
}
