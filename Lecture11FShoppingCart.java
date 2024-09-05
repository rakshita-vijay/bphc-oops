public class Lecture11FShoppingCart {
  public static void main(String[] args) {
    Lecture11GProduct prod1 = new Lecture11GProduct();

    System.out.println(prod1.toString());
    System.out.println();
    System.out.println(prod1.getProductName());
    System.out.println(prod1.getPrice());
    System.out.println(prod1.getQuantity());
  }
}
