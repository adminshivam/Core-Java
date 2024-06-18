public class AccessModifiers {
  private int abc; // only to the class
  protected int abc2; // not in diff package non-subclass
  public int abc3; // accessible everywhere
  public static void main(String[] args) {
    AccessModifiers am = new AccessModifiers();
    am.abc = 10;
    am.abc2 = 20;
    am.abc3 = 30;
    System.out.println(am.abc);
    System.out.println(am.abc2);
    System.out.println(am.abc3);
  }
}
