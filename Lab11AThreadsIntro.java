class A {
  public void show(){
    for(int i=0;i<50;i++)
      System.out.println("Class A");
  }
}

class B {
  public void show(){
    for(int i=0;i<50;i++)
      System.out.println("Class B");
  }
}

public class Lab11AThreadsIntro {
  public static void main(String [] args){
    A obj1 = new A();
    B obj2 = new B();
    obj1.show();
    obj2.show();
  }
}
