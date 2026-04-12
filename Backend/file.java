
import java.io.File;
import java.util.Scanner;

public class file {
  public static void main(String[] args) {

    try{
      File obj=new File("myfile.txt");
      Scanner sc=new Scanner(obj);
  }catch(Exception e){
    System.out.println("File not found can");
  }
  }

}
