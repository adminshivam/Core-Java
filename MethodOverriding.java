class A {
  public void show() {
    System.out.println("A");
  }

  public void diffFunc() {
    System.out.println("Diff A");
  }
}

class B extends A {
  public void show() {
    System.out.println("B");
  }
}

public class MethodOverriding {
  public static void main(String[] args) {
    B b = new B();
    b.show();
    b.diffFunc();
  }
}
