public class Lecture11ATestStatic {
  public static void main(String[] args) {
    Lecture11BStudent stud1 = new Lecture11BStudent();
    Lecture11BStudent stud2 = new Lecture11BStudent();
    Lecture11BStudent stud3 = new Lecture11BStudent();

    Lecture11BStudent.printTotalStudents();

    System.out.println(stud1.toString() + " ");
    System.out.println(stud2.toString() + " ");
    System.out.println(stud3.toString() + " ");
  }
}
