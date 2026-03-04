import java.util.ArrayList;


public class list1 {

  public static void main(String[] args) {
     ArrayList<String> list=new ArrayList<String>();
      list.add("raju");
      list.add("sonu");
      list.add(1, "Sonam");

        System.out.println(list);

        // Set value at index 0
        list.set(0, "raju man");

        System.out.println(list);
  }

}



