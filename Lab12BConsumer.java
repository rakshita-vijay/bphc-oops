class Lab12BConsumer extends Thread {
  Buffer buffer;
  public Lab12BConsumer (Buffer b) {
    buffer = b;
  }
  public void run() {
    while(true){
      int element = buffer.pop();
        System.out.println("             Poped and Consumed: " + element);
        try {
          sleep(300);
        }
        catch(InterruptedException e) {
          System.out.println("Interrupted");
        }
      }
  }
}
