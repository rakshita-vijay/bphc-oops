import java.util.Scanner;

public class Lab6BTransactionProcessor {
  double balance;

  public Lab6BTransactionProcessor(double initialAmount) {
    balance = initialAmount;
  }

  public void processTransaction(double transactionAmount) {
    try {
      if (transactionAmount < 0) {
        throw Lab6CNegativeAmountException("Transaction amount cannot be negative.");
      } else if (transactionAmount > balance) {
        throw Lab6DInsufficientBalanceException("Insufficient balance. Transaction declined.");
      }
      balance -= transactionAmount;
    } catch (Lab6CNegativeAmountException || Lab6DInsufficientBalanceException errorThrown) {
      System.out.println(errorThrown);
    } catch (Exception ex) {
      System.out.println("An unexpected error occurred. Please try again later.");
    }
  }
}
