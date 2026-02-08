
import java.util.Scanner;

public class pass{
  public static void main(String[] args) {
      int orignalpass=1415;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter your password ");
      int password=sc.nextInt();
      if(password==orignalpass){
        System.out.print("your account is open ");
      }
      else{
        System.out.println("wrong password!");
      }
  }
}


