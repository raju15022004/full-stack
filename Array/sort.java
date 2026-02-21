public class sort{

  public static void main(String[] args) {
      int number[]={1,2,3,4,1,2,3,1,2};

      int n=number.length;
      int count=0;
      int cand=0;
      for(int i=0;i<n;i++){
        if(count==0){
          cand=number[i];
        }
        if(cand==number[i]){
          count++;
        }
        else{
          count--;
        }
      }
      System.out.println("MJ element ="+cand);
  }
}
