public class min{

  public static void main(String[] args){

    int number[]={10,5,25,30,40};

    int min= number[0];

    for(int i=0;i<number.length;i++){
      if(min>number[i]){
        min=number[i];
      }
    }
    System.out.println("min element"+min);
  }
}
