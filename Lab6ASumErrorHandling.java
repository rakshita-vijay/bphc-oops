public class Lab6ASumErrorHandling {
  public static void main(String[] args) {
    int num1;
    int num2;

    try {
      num1 = Integer.parseInt(args[0]);
      num2 = Integer.parseInt(args[1]);
      int sum = num1 + num2;
      System.out.println("Sum: " + sum);
    } catch(NumberFormatException nfe) {
      System.out.println("Number Format Exception :(");
    } catch (ArrayIndexOutOfBoundsException aiobe) {
      System.out.println("Array Index Out Of Bounds Exception!!!");
    }
  }
}
