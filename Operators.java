public class Operators {
  public static void main(String[] args) {
    int num1 = 20;
    int num2 = 30;
    int sum = num1 + num2;
    int sub = num1 - num2;
    int mul = num1 * num2;
    int div = num1 / num2;
    int mod = num1 % num2;

    int incr = num1 += 2;
    int subt = num2 -= 2;

    num1++; // assign and increment - post increment
    ++num1; // increment and assign - pre increment
    num2--; // decrement and assign - post decrement
    --num2; // assign and decrement - pre decrement

    boolean b1 = num1 < num2;
    boolean b2 = num1 >= num2;
    boolean b3 = num1 < num2 && num2 < num1;
    boolean b4 = !b3;

    // & and && are not same
    // | or ||
    // ^ exclusive or
    //! not

    // & will check for all conditions and && is like short circuit


    System.out.println(sum);
    System.out.println(sub);
    System.out.println(mul);
    System.out.println(div);
    System.out.println(mod);
    System.out.println(incr);
    System.out.println(subt);
    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
  }
}
