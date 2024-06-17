class Student {
  String name;
  int age;
}

public class Arrays {
  public static void main(String[] args) {
    Student students[] = new Student[3];
    Student s1 = new Student();
    s1.name = "shivam";
    s1.age = 25;

    Student s2 = new Student();
    s2.name = "parul";
    s2.age = 35;

    Student s3 = new Student();
    s3.name = "harsh";
    s3.age = 30;

    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for (int i = 0; i < students.length; i++) {
      System.out.println("Student " + students[i].name + " age is " + students[i].age);
    }

    for (Student student : students) {
      System.out.println("Student " + student.name + " age is " + student.age);
    }
  }
}
