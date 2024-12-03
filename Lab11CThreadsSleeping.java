class AAA extends Thread{
  public void run(){
    for(int i=0;i<5;i++){
      System.out.println("Class AA");
      try{
        Thread.sleep(5);
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class BBB extends Thread{
  public void run(){
    for(int i=0;i<5;i++){
      System.out.println("Class BB");
      try{
        Thread.sleep(2);
      } catch(InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class Lab11CThreadsSleeping {
  public static void main(String [] args){
    AAA obj1 =new AAA();
    BBB obj2 =new BBB();
    obj1.start();
    try{
      Thread.sleep(5);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    obj2.start();
  }
}
