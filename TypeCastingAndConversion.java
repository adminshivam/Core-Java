public class TypeCastingAndConversion {
  public static void main(String[] args) {
    int a = 257;
    byte b = (byte) a; // 128 to byte is -128 and 257 to byte 1, because it mod with whole range of byte

    float x = 5.6f;
    int y = (int) x;

    System.err.println(a);
    System.err.println(b);
    System.err.println(x);
    System.err.println(y);
  }
}
