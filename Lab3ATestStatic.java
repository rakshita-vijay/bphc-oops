public class Lab3ATestStatic {
  public static void main(String[] args) {
    Lab3BStudent stud1 = new Lab3BStudent();
    Lab3BStudent stud2 = new Lab3BStudent();
    Lab3BStudent stud3 = new Lab3BStudent();

    Lab3BStudent.printTotalStudents();

    System.out.println(stud1.toString() + " ");
    System.out.println(stud2.toString() + " ");
    System.out.println(stud3.toString() + " ");
  }
}
