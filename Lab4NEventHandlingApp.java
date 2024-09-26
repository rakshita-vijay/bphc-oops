public class Lab4NEventHandlingApp {
  public static void main(String[] args) {
    Lab4PConference conference = new Lab4PConference();
    Lab4QWedding wedding = new Lab4QWedding();
    Lab4SCateredConference cateredConference = new Lab4SCateredConference();

    conference.eventName = "Big Bang";
    conference.eventDate = "Sept 23, 2024";
    conference.numAttendees = 10;
    conference.costPerAttendee = 20;
    conference.printEventDetails();
    System.out.println();

    wedding.eventName = "Big Day";
    wedding.eventDate = "Nowhere in the near future";
    wedding.numGuests = 20;
    wedding.venueCost = 30;
    wedding.printEventDetails();
    System.out.println();

    cateredConference.eventName = "Scientific Discourse";
    cateredConference.eventDate = "Too boring to remember";
    cateredConference.setMenu("5-course buffet");
    cateredConference.numAttendees = 30;
    cateredConference.cateringCostPerPerson = 40;
    cateredConference.printEventDetails();
    System.out.println();
  }
}
