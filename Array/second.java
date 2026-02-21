public class second{

  public static void main(String[] args) {

    int number[]={1,2,3,4,5,6,7,8};
      int first=Integer.MIN_VALUE;
      int second=Integer.MIN_VALUE;

      for(int i:number){
        if(i>first){
          second=first;
          first=i;
        }
        else if(i>second && i !=first){
          second=i;
        }

      }
      System.out.println("first ="+first + "second ="+second);
  }
}
