import java.lang.Thread;

class AA extends Thread {
  public void run(){
    for(int i=0;i<5;i++)
      System.out.println("Class AA");
  }
}

class BB extends Thread {
  public void run(){
    for(int i=0;i<5;i++)
      System.out.println("Class BB");
  }
}

public class Lab11BThreadsPrioritySetting {
  public static void main(String [] args){
    AA obj1 = new AA();
    BB obj2 = new BB();
    //System.out.println(obj1.getPriority());
    // obj1.setPriority(10);
    // obj2.setPriority(2);
    obj1.start();
    obj2.start();

    // obj1.join();
    // obj2.join();
  }
}
