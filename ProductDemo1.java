import java.util.ArrayList;
import java.util.Comparator;

class ProductDemo1 {
  public static void main(String[] args) {
    String[] st = args[0].split("#");
    int numberOfProducts = st.length/3;

    ArrayList<Product> products = new ArrayList<Product>();
    // Product[] prods = new Product[5];

    int ptr = 0;
    for(int index = 0; index < numberOfProducts; index++, ptr += 3) {
      products.add(new Product(Integer.parseInt(st[ptr]), st[ptr+1], Double.parseDouble(st[ptr+2])));
      // products.get(index).display();
      // System.out.println(Integer.parseInt(st[ptr])  + "," + st[ptr+1] + "," + Double.parseDouble(st[ptr+2]));
      if (products.get(index).price > Double.parseDouble(st[st.length - 1])) {
        products.get(index).display();
      }
    }

    System.out.println();

    // searching by productNo
    int count = -2;
    for(int index = 0; index < numberOfProducts; index++) {
      if (products.get(index).getProductNo() == Integer.parseInt(st[st.length - 1])) {
        count = index;
      } else {
        continue;
      }
    }
    // products.search(Double.parseDouble(st[st.length - 1]));

    if (count >= 0) {
      System.out.println(Double.parseDouble(st[st.length - 1]) + " product number is found at index " + (count + 1) + "\nIt's details are: ");
      products.get(count).display();
    } else {
      System.out.println(Double.parseDouble(st[st.length - 1]) + " product number not found");
    }

    System.out.println();

    products.sort(Comparator.comparingInt(Product::getProductNo));

    for (int index = 0; index < products.size(); index++) {
      products.get(index).display();
    }

    System.out.println();

    products.sort(Comparator.comparingDouble(Product::getPrice));

    for (int index = 0; index < products.size(); index++) {
      products.get(index).display();
    }
  }
}
