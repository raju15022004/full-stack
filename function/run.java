class A{
  void show(){
    System.out.println("Class A");
  }
}

class B extends A{
  void show(){
    System.out.println("class B");
  }
}

public class run{
  public static void main(String[] args) {
      A obj=new A();
      obj.show();
  }

}
