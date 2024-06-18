public class Strings {
  public static void main(String[] args) {
    String name = new String("shivam"); // immutable
    name = name + " gupta"; // new string is created in string pool constant of heap.
    System.out.println(name);

    // mutable string
    StringBuffer sb = new StringBuffer("shivam");
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    sb.ensureCapacity(100);
    System.out.println(sb.capacity());
    sb.append(" gupta");
    System.out.println(sb);
  }
}