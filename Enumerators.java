enum Laptop {
  DELL, HP, LENOVO, MACBOOK, ASUS, ACER, APPLE, SAMSUNG;
}

enum EnhancedLaptop {
  DELL(200), HP, LENOVO, MACBOOK(500), ASUS, ACER, APPLE, SAMSUNG;

  private int price;

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  EnhancedLaptop() {
    this.price = 100;
  }

  EnhancedLaptop(int price) {
    this.price = price;
  }
}

public class Enumerators {
  public static void main(String[] args) {
    Laptop[] l = Laptop.values();

    for (Laptop laptop : l) {
      System.out.println("Laptop " + laptop);
    }

    EnhancedLaptop[] el = EnhancedLaptop.values();

    for (EnhancedLaptop enhancedLaptop : el) {
      System.out.println(enhancedLaptop.toString() + " has price " + enhancedLaptop.getPrice());
    }
  }
}
