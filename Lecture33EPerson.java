import java.io.Serializable;

class Lecture33EPerson implements Serializable {
  private String name;
  private int age;
  private String gender;

  public Lecture33EPerson(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String toString() {
    return "Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\n";
  }
}
