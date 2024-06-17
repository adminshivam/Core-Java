class Calculator {
  int a;

  public int add(int x, int y) {
    return x + y;
  }

  public int add(int x, int y, int z) {
    return x + y + z;
  }
}

public class Classes {
  public static void main(String[] args) {
    Calculator c = new Calculator();
    int result = c.add(10, 20);
    System.out.println("result 1 : " + result);
    System.out.println("result 2 : " + c.add(10, 20, 30));
  }
}
