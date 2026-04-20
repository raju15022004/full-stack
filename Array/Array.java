
import java.util.Scanner;

public class Array{

  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Raju  sahani ");
    int size=sc.nextInt();

    int age[]=new int[size];

    for(int i=0;i<size;i++){
      age[i]=sc.nextInt();
    }
    System.out.println("Student's list");

    for(int i:age){
      System.out.println(i);
    }
  }
}
