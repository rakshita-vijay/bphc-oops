public class Lecture11BStudent {
  static int totalStudents = 0;

  public Lecture11BStudent() {
    totalStudents++;
  }

  public static void printTotalStudents() {
    System.out.println("Total number of students: " + totalStudents);
  }
}
