public class Lecture11CCalculator {
  public static double add(double num1, double num2) {
    return (num1 + num2);
  }

  public static double subtract(double num1, double num2) {
    return (num1 - num2);
  }

  public static double multiply(double num1, double num2) {
    return (num1 * num2);
  }

  public static double divide(double num1, double num2) {
    return (num1 / num2);
  }

  public static void main(String[] args) {
    System.out.println(Lecture11CCalculator.add(55.1, 11.5));
    System.out.println(Lecture11CCalculator.subtract(55.1, 11.5));
    System.out.println(Lecture11CCalculator.multiply(55.1, 11.5));
    System.out.println(Lecture11CCalculator.divide(55.1, 11.5));
  }
}