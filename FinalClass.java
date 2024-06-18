// final keyword - variable, method, class

class SampleClass {
  final public void show() {
    System.out.println("Show sample class");
  }
}

final class C extends SampleClass {
  // method overriding not work here as parent/base class have final keyword
  // public void show() {
  // System.out.println("Show C class");
  // }
}

// inheritance will not work here as parent/base class have final keyword
// class D extends C {

// }

public class FinalClass {
  public static void main(String[] args) {
    final double PI = 3.14;
    // PI = 23.4; // this will give us the error as PI is constant/final not able to
    // reassign it.

    C c = new C();
    c.show();
  }
}
