public class Lab3GProduct {
  private String productName;
  private double price;
  private int quantity;

  public Lab3GProduct() {
    productName = ".";
    price = 0.0;
    quantity = 0;
  }

  public Lab3GProduct(String productName, double price, int quantity) {
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
  }

  public String getProductName() { return productName; }
  public double getPrice() { return price; }
  public int getQuantity() { return quantity; }

  public void setQuantity(int quantity) { this.quantity = quantity; }

  public double calcTotalCost() {
    return (this.price * (double) this.quantity);
  }
}
