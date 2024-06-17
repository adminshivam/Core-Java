public class Conditional {
  public static void main(String[] args) {
    System.out.println("Compare Ages");

    int age1 = 100;
    int age2 = 200;

    if (age1 > age2) {
      System.out.println("age1 is greater than age2");
    } else {
      System.out.println("age2 is greater than age1");
    }

    if (age1 > age2)
      System.out.println("Hi my age is greater than my age2");
    else if (age2 > age1) {
      System.out.println("Hi my age is greater than my age1");
    } else
      System.out.println("We have same ages");

    boolean b = (age1 % 2 == 0) ? true : false;
    System.out.println(b);

    // switch

    switch (age1) {
      case 100:
        System.out.println("This is first true");
        break;
      case 200:
        System.out.println("This is second true");
        break;

      default:
        break;
    }
  }

}
