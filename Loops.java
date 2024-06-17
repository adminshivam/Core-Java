public class Loops {
  public static void main(String[] args) {
    System.out.println("This is an example of loops");

    String statement = "Hi";
    for (int i = 0; i < 5; i++) {
      System.out.println(statement);
    }

    int i = 0;
    while (i < 5) {
      System.out.println("While " + i);
      i++;
    }

    int j = 1;
    do {
      System.out.println("Printing : " + j);
      j++;
    } while (j <= 3);

  }
}
