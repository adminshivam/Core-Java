class A {
  public void show() {
    System.out.println("Show this");
  }
}

class B extends A {
  @Override // this is an annotation helps to debug code at compile time that you want to
            // achieve something but don't get it.
  public void show() {
    System.out.println("Show that");
  }
}

public class Annotations {
  public static void main(String[] args) {
    B b = new B();
    b.show();
  }
}
