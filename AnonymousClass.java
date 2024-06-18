class A {
  public void show() {
    System.out.println("A");
  }
}

abstract class AbstractA {
  abstract public void show();
}

public class AnonymousClass {
  public static void main(String[] args) {
    A a = new A() {
      public void show() {
        System.out.println("Inside anonymous A");
      }
    };

    a.show();

    AbstractA aa = new AbstractA() {
      public void show() {
        System.out.println("Inside anonymous AbstractA");
      }
    };

    aa.show();
  }
}
