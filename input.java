
import java.util.Scanner;

public class input{

  public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number = ");
  int num=sc.nextInt();
  if(num>0){
    System.out.println("Given number is positive ");
  }
  else if(num<0){
    System.out.println("Given number is negative");
  }
  else{
    System.out.println("Given number is 0");
  }
  }
}

