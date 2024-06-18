class A {
  public void someMethod(int num) throws Exception {
    if (num <= 0) {
      System.out.println("Hey you have entered 0 roll no.");
      throw new IllegalArgumentException();
    }

    try {
      if (num > 100) {
        System.out.println("A class can't have more than 100 students.");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}

public class ExceptionHandling {
  public static void main(String[] args) {
    A a = new A();
    try {
      a.someMethod(0);
    } catch (Exception e) {
      System.err.println("Something went wrong " + e);
    }
    try {
      a.someMethod(101);
    } catch (Exception e) {
      System.err.println("Something went wrong " + e);
      System.out.println(e.getStackTrace());
    }
  }
}
