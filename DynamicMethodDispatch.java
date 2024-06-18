class A {
  public void show() {
    System.out.println("A");
  }
}

class B extends A {
  public void show() {
    System.out.println("B");
  }
}

class C extends B {
  public void show() {
    System.out.println("C");
  }
}

public class DynamicMethodDispatch {
  public static void main(String[] args) {
    A a = new A();
    a.show();

    a = new B();
    a.show();

    a = new C();
    a.show();
  }
}
