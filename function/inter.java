interface A{
  int x=20;
  String name="raju";

  void show();
  void output();
  default void name(){
    System.out.println("this is a default method");
  }
}

interface B extends A{

  void add();

}

class C implements A,B{
    public void show(){
      System.out.println("show method");
    }
    public void output(){
      System.out.println("output method");
    }

    public void add(){

    }

}

public class inter{
  public static void main(String[] args) {
      C obj=new C();
      obj.show();
      obj.output();
      obj.add();
  }
}
