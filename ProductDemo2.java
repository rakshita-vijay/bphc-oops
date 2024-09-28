
class ProductDemo2 {
  public static void main(String[] args) {
    String[] st = args[0].split("#");
    int numberOfProducts = st.length/3;

    Product[] products = new Product[numberOfProducts];

    int ptr = 0;
    for(int index = 0; index < numberOfProducts; index++, ptr += 3) {
      products[index] = new Product(Integer.parseInt(st[ptr]), st[ptr+1], Double.parseDouble(st[ptr+2]));
      if (products[index].price > Double.parseDouble(st[st.length - 1])) {
        products[index].display();
      }
    }

    System.out.println();

    // searching by productNo
    int count = -2;
    for(int index = 0; index < numberOfProducts; index++) {
      if (products[index].getProductNo() == Integer.parseInt(st[st.length - 1])) {
        count = index;
      } else {
        continue;
      }
    }
    // products.search(Double.parseDouble(st[st.length - 1]));

    if (count >= 0) {
      System.out.println(Double.parseDouble(st[st.length - 1]) + " product number is found at index " + (count + 1) + "\nIt's details are: ");
      products[count].display();
    } else {
      System.out.println(Double.parseDouble(st[st.length - 1]) + " product number not found");
    }

    System.out.println();

    System.out.println("Sorting price:");
    Product holder = null;
    for (int counter = 0; counter < (products.length - 1); counter++){
      for (int index = 0; index < (products.length - 1 - counter); index++) {
        if (products[index].price > products[index + 1].price) {
          holder = products[index];
          products[index] = products[index + 1];
          products[index + 1] = holder;
        }
      }
    }

    for (int index = 0; index < products.length; index++) {
      products[index].display();
    }
  }
}
