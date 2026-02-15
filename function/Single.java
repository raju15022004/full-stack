class Student{

  String name;
  int age;
  void output(){
    System.out.println("name ="+name);
    System.out.println("age ="+age);
  }
}

class Teacher extends Student{

}

public class Single{

  public static void main(String[] args) {
     Teacher t1=new Teacher();
     t1.name="raju";
     t1.age=23;
     t1.output();
  }
}
