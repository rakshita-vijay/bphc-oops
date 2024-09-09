import java.util.ArrayList;
import java.util.Scanner;

public class TestFormFibonacci {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter the starting number of the fibonacci series: ");
    int firstElement = scan.nextInt();
    System.out.println("Enter the final number of the fibonacci series: ");
    int lastElement = scan.nextInt();

    scan.close();

    ArrayList<Integer> fibonacciArray = new ArrayList<>();
    fibonacciArray.add(0);
    fibonacciArray.add(1);

    int swapNum;
    int index = 2;

    for (int count = 0; ; count++) {
      swapNum = fibonacciArray.get(index - 1) + fibonacciArray.get(index - 2);
      if (swapNum > lastElement) {
        break;
      }
      fibonacciArray.add(swapNum);
      index++;
    }

    System.out.println("Fibonacci series between " + firstElement + " and " + lastElement + ":");
    for (int num : fibonacciArray) {
      if (num >= firstElement && num <= lastElement) {
        System.out.print(num + " ");
      }
    }

    System.out.println();
  }
}
