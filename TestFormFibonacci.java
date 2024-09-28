import java.util.ArrayList;
import java.util.Scanner;

public class TestFormFibonacci {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the starting number of the fibonacci series: ");
    int firstElement = scan.nextInt();
    while (firstElement < 0) {
      System.out.print("Number entered is below zero. Re-enter number: ");
      firstElement = scan.nextInt();
    }
    System.out.println();

    System.out.print("Enter the final number of the fibonacci series: ");
    int lastElement = scan.nextInt();
    while (lastElement < firstElement) {
      System.out.print("Number entered is below first element. Re-enter number: ");
      lastElement = scan.nextInt();
    }
    System.out.println();

    scan.close();

    ArrayList<Integer> fibonacciArray = new ArrayList<>();
    fibonacciArray.add(0);
    fibonacciArray.add(1);

    int swapNum;
    int index = 2;

    for (;;) {
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
