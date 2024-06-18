abstract class A {
  // must be implemented by derived classes
  abstract public void show();
}

class B extends A {
  public void show() {
    System.out.println("B");
  }
}

public class AbstractClass {
  public static void main(String[] args) {
    B b = new B();
    b.show();
  }
}
