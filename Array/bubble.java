public class bubble {

  public static void main(String[] args) {
      int arr[]={10,2,4,3,7,6,8,9,8,9,6};
      int n=arr.length;
      System.out.println("Before Sorting");
      for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");
      }
        for(int i=0;i<n-1;i++){
          for(int j=0;j<n-1-i;i++){
            if(arr[j]>arr[j+1]){
              int temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
            }
          }
        }

        System.out.println("After Sorting");
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
  }

}
