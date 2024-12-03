public class Lab10BExceptions3 {
  public static void main(String[] args) {
    try {
      divide(10, 0);
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }
  }
static void divide(int a, int b) {
    if (b == 0) {
      throw new ArithmeticException("Division by zero is not allowed.");
    }
    System.out.println(a / b);
  }
}
