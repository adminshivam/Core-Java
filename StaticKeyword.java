// Pointers - static run first then create object, no need for object in case of static.
// Class.forName("className"); used for initialize of class only not object


class Computer {
  String keyboard;
  String name;
  int price;
  static int makingCost;

  static {
    System.out.println("Inside static");
    makingCost = 10000;
  }

  public Computer(String keyboard, String name, int price) {
    this.keyboard = keyboard;
    this.name = name;
    this.price = price;
  }

  public void show() {
    System.out.println("Computer Props -> " + keyboard + ", " + name + ", " + price + ", " + makingCost);
  }

  public static void showStatic(Computer c) {
    System.out.println("Computer Props -> " + c.keyboard + ", " + c.name + ", " + c.price + ", " + makingCost);
  }

}

public class StaticKeyword {
  public static void main(String[] args) {
    Computer computer = new Computer("abc", "xyz", 200);
    computer.show();
    Computer.showStatic(computer);
    Computer.makingCost = 4000;
    computer.show();
  }
}
