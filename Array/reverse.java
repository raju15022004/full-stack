import java.util.Arrays;

public class reverse{

  public static void main(String[] args){

    int number[]={1,2,3,4,5,6,7};

    // int start=0;
    // int end=number.length-1;

    // while(start<end){
    //   int temp=number[start];
    //   number[start]=number[end];
    //   number[end]=temp;

    for(int i=0;i<number.length/2;i++){
      int temp=number[i];
      number[i]=number[number.length-1-i];
      number[number.length-1-i]=temp;

      // start++;
      // end--;
    }
    System.out.println("Reverse Array ="+ Arrays.toString(number));

  }
}
