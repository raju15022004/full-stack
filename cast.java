
import java.util.Scanner;

public class cast{
  public static void main(String[] args) {
      // int a=5;
      // double b=a;
      // System.out.print(b);

      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a number = ");
      int num1=sc.nextInt();
      System.out.print("Enter another number = ");
      int num2=sc.nextInt();
      int sum=num1+num2;
      System.out.print("sum = "+sum);
  }
}
