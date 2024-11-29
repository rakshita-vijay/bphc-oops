class Lecture30DpcMain {
  public static void main(String[] args) {
    Lecture30ABuffer buffer = new Lecture30ABuffer(2);
    Lecture30BProducer prod = new Lecture30BProducer(buffer);
    Lecture30CConsumer cons = new Lecture30CConsumer(buffer);

    prod.start();
    cons.start();
  }
}
