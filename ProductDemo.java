import java.util.ArrayList;
import java.util.Comparator;

class ProductDemo {
  public static void main(String[] args) {
    String[] st = args[0].split("#");
    int numberOfProducts = st.length/3;

    // Product[] products = new Product[numberOfProducts];
    ArrayList<Product> products = new ArrayList<Product>();

    int ptr = 0;
    for(int index = 0; index < numberOfProducts; index++, ptr += 3) {
      products.add(new Product(Integer.parseInt(st[ptr]),st[ptr+1],Double.parseDouble(st[ptr+2])));
      // products[index].search(pid);
      products.get(index).display();
      // System.out.println(Integer.parseInt(st[ptr])  + "," + st[ptr+1] + "," + Double.parseDouble(st[ptr+2]));
    }

    products.sort(Comparator.comparingInt(Product::getProductNo));
  }
}
