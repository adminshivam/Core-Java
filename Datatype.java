public class Datatype {
  public static void main(String[] args) {
    byte num1 = 127; // byte is 1 byte
    short num2 = 32767; // short is 2 bytes
    int num3 = 2147483647; // int is 4 bytes (default value)
    long num4 = 922337203685477580L; // long is 8 bytes

    float fl = 5.8f; // float is 4 bytes
    double d = 5.8; // double is 8 bytes (default value)

    char c = 'A'; // char is 2 bytes

    boolean b = true; // boolean is 1 byte (only true or false nothing else)

    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
    System.out.println(fl);
    System.out.println(d);
    System.out.println(c);
    System.out.println(b);
  }
}
