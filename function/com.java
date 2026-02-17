class A{
  int age;
  String name;
  void show(int a){
    age=a;
    System.out.println("age =" + age);
  }
}

class B extends A{
  void show(int a,String n){
    age=a;
    name=n;
    System.out.println("age =" + age);
    System.out.println("name =" + name);
  }
}

public class com{
  public static void main(String[] args) {
  B obj=new B();
  obj.show(25);
  obj.show(25,"raju");
  }
}
