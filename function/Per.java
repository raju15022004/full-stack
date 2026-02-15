

class Person{

  private int age;

    Person(int age) {
      this.age=age;

    }
    int getAge(){
      return age;
    }
}

public class Per{

  public static void main(String[] args){
    Person obj=new Person(20);
    System.out.println(obj.getAge());
  }
}
