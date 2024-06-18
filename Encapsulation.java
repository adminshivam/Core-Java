class Human {
  private String name;
  private int age;

  // default constructor
  Human() {

  }

  // parameterized constructor
  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
}

public class Encapsulation {
  public static void main(String[] args) {
    Human h = new Human();
    h.setName("shivam");
    h.setAge(25);
    System.out.println(h.getName());
    System.out.println(h.getAge());

    Human h1 = new Human("abc", 20);
    System.out.println(h1.getName());
    System.out.println(h1.getAge());
  }
}
