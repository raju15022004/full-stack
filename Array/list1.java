import java.util.ArrayList;


public class list1 {

  public static void main(String[] args) {
     ArrayList<String> list=new ArrayList<String>();
      list.add("raju");
      list.add("Stark");
      list.add(1, "iron");

        System.out.println(list);

        // Set value at index 0
        list.set(0, "iron man");

        System.out.println(list);
  }

}



