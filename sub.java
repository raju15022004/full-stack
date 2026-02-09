
import java.util.Scanner;

public class sub{

  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Englisg ");
      int eng=sc.nextInt();
      System.out.print("Computer = ");
      int com=sc.nextInt();
      int total=eng+com;
      if(total>=90 && total<100){
        System.out.print("your grade is A");

      }
      else if(total>=80 && total<90){
          System.out.print("your grade is B");
      }
      else{
        System.out.print("you are fail");
      }

  }
}
