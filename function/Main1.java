

//   public int age;
//   void output(){
//     System.out.println("age = "+age);
//   }
//  }

//   public class Main1{

//     public static void main(String[] args) {
//         Person obj=new Person();
//         obj.age=23;
//         obj.output();
//     }
// }



///////////// private //////////////////

class Person{

   private int age;
  void setAge(int age){
    this.age=age;

  }
  int getAge(){
    return age;
  }
}

public class Main1{

  public static void main(String[] args) {
      Person obj=new Person();
      obj.setAge(20);
      System.out.println(obj.getAge());
  }
}
