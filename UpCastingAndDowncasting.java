class A {
  public void showA() {
    System.out.println("A");
  }
}

class B extends A {
  public void showB() {
    System.out.println("B");
  }
}

public class UpCastingAndDowncasting {
  public static void main(String[] args) {
    A b = new B(); // same as A b = (A) new B(); (upcasting)
    b.showA();

    B newB = (B) b; // (downcasting)
    newB.showA();
    newB.showB();
  }
}
