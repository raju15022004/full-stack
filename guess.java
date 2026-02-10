
import java.util.Random;
import java.util.Scanner;

public class guess{

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random ran=new Random();
      int numberToGuess=ran.nextInt(100) + 1;
      int guess;
      do {
        System.out.print("Guess a number = ");
        guess=sc.nextInt();
        if(numberToGuess==guess){
          System.out.print("Congratulations you are won !");
          break;
        }
        else if(guess<numberToGuess){
          System.out.print("Too Low");

        }
        else if(guess>numberToGuess){
          System.out.print("Too High");
        }

      } while (true);
  }
}
