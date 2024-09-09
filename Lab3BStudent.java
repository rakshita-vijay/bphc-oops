public class Lab3BStudent {
  static int totalStudents = 0;

  public Lab3BStudent() {
    totalStudents++;
  }

  public static void printTotalStudents() {
    System.out.println("Total number of students: " + totalStudents);
  }
}
