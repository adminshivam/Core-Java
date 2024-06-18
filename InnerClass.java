class A {
  public void methodA() {
    System.out.println("Method A");
  }

  class B {
    public void methodB() {
      System.out.println("Method B");
    }
  }
}

public class InnerClass {
  public static void main(String[] args) {
    A a = new A();
    a.methodA();

    // object creation for inner class B.
    A.B b = a.new B();
    b.methodB();
  }
}
