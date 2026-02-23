public class selection {

  public static void main(String[] args) {
      int age[]={10,2,4,3,6,8};
      int n=age.length;

      for(int i=0;i<n;i++){
        int smallest=i;
        for(int j=0;j<n;j++){
          if(age[smallest]>age[i]){
            smallest=j;
          }
        }

        int temp=age[smallest];
        age[smallest]=age[i];
        age[i]=temp;
      }

      for(int i=0;i<n;i++){
        System.out.println(age[i]+"");
      }
  }

}
