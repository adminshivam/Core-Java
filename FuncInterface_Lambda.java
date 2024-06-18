@FunctionalInterface
interface SomeInterface {
  void someMethod(int x);
}

public class FuncInterface_Lambda {
  public static void main(String[] args) {
    // till java 7
    SomeInterface i = new SomeInterface() {
      @Override
      public void someMethod(int x) {
        System.out.println("Working with " + x);
      }
    };

    i.someMethod(10);

    // java 8 lambda function
    SomeInterface j = (x) -> System.out.println("Lambda working with " + x);
    j.someMethod(20);
  }
}