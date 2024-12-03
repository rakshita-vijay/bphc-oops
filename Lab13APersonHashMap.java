import java.io.*;

// The Lab13APersonHashMap class implements Serializable for object serialization
class Lab13APersonHashMap implements Serializable {
  // private static final long serialVersionUID = 1L;
  private String name;
  private int age;
  private String gender;

  Lab13APersonHashMap() {}

  Lab13APersonHashMap(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Name: " + name + "\nAge: " + age + "\nGender: " + gender;
  }
}
