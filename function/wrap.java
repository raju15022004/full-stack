public class wrap{
  public static void main(String[] args) {
      int a=25;
      Integer i=Integer.valueOf(a);
      Integer j=a;
      int b=i.intValue();
      int c=i;
      System.out.println("primitive ="+ a);
      System.out.println("Wrapper class ="+i);
  }
}
