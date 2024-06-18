// class auto have super() always and base class always inherits from Object class.

class A {
  A() {
    System.out.println("In A Class Constructor");
  }
}

class B extends A {
  B() {
    super();
    System.out.println("In B Class Constructor");
  }

  B(int n) {
    this();
    System.out.println("In B Class Int Constructor");
  }
}

public class Inheritance {
  public static void main(String[] args) {
    B b = new B(5);
    b.getClass();
  }
}
