class Lecture30CConsumer extends Thread {
  Lecture30ABuffer buffer;

  public Lecture30CConsumer(Lecture30ABuffer b) {
    buffer = b;
  }

  public void run() {
    while (true) {
      int element = buffer.pop();
      System.out.println("Popped and Consumed: " + element);

      try {
        sleep(300);
      }
      catch (InterruptedException e) {
        System.out.println("Interrupted");
      }
    }
  }
}
