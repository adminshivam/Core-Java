public class Literals {
  public static void main(String[] args) {
    int a = 5;
    int b = 0b101; // base 2
    int c = 0xE; // base hex
    int d = 20_00_000; // underscore will be not included

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
