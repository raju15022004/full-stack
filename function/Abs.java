abstract class Person{

abstract void show();

    public Person() {
      System.out.println("parent Constructor");
    }

}

class Student extends Person{

    public Student() {
      super();
      System.out.println("Child constructor");
    }

  public void show(){
  System.out.println("Child class");
  }
}

public class Abs{
  public static void main(String[] args) {
      Student obj=new Student();
      obj.show();
  }

}
