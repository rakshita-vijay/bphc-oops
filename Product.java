class Product{
  int productNo;
  String name;
  double price;

  Product(int pno, String nam, double pr) {
    productNo = pno;
    name = nam;
    price = pr;
  }

  int getProductNo() {
    return productNo;
  }

  String getName() {
    return name;
  }

  double getPrice() {
    return price;
  }

  void display() {
    System.out.println(productNo + ", " + name + ", " + price);
  }

  // void greatprice(double maxvalue) {
  //   if(price > maxvalue)
  //     display();
  // }

  // void search(int id) {
  //   if(id == productNo)
  //     display();
  //   else
  //     System.out.println("None");
  // }
}
