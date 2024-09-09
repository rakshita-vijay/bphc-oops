public class Lab3FShoppingCart {
  public static void main(String[] args) {
    Lab3GProduct prod1 = new Lab3GProduct();

    System.out.println(prod1.toString());
    System.out.println();
    System.out.println(prod1.getProductName());
    System.out.println(prod1.getPrice());
    System.out.println(prod1.getQuantity());
  }
}
