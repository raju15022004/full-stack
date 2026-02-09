
import java.util.Scanner;

public class case1{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter an alphabet ");
      char value=sc.next().charAt(0);
      switch(value){
        case 'a':
          System.out.print("You entered a vowel a");
          break;

          case 'i':
          System.out.print("You entered a vowel i");
          break;

          case 'o':
          System.out.print("You entered a vowel o");
          break;

          case 'u':
          System.out.print("You entered a vowel u");
          break;
          default:
            System.out.print("this is not a vowel");
      }
  }
}
