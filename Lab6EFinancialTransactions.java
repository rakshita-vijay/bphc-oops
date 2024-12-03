import java.util.Scanner;

public class Lab6EFinancialTransactions {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    try {
      System.out.println("Enter initial amount: ");
      double initAmount = scan.nextDouble();

      Lab6BTransactionProcessor transPros = new Lab6BTransactionProcessor(initAmount);

      System.out.println("Enter transaction amount: ");
      double transAmount = scan.nextDouble();

      transPros.processTransaction(transAmount);
    } catch (NumberFormatException nfe) {
      System.out.println("Invalid transaction amount format.");
    }
    scan.close();
  }
}
