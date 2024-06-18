interface Computer {
  int abc = 100; // final static variable automatically

  void show(); // abstract public method automatically

  String getType();
}

class Laptop implements Computer {
  public void show() {
    System.out.println("Laptop is working");
  }

  public String getType() {
    return "Laptop";
  }
}

class PC implements Computer {
  public void show() {
    System.out.println("PC is working");
  }

  public String getType() {
    return "Computer";
  }
}

class Work {
  public void work(Computer computer) {
    System.out.println("I am working on " + computer.getType());
  }
}

public class Interfaces {
  public static void main(String[] args) {
    Computer pc = new PC();
    Computer laptop = new Laptop();

    Work work = new Work();
    work.work(pc);
    work.work(laptop);
  }
}
