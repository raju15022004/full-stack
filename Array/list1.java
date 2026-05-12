import java.util.ArrayList;


public class list1 {

  public static void main(String[] args) {
     ArrayList<String> list=new ArrayList<String>();
      list.add("raju");
      list.add("Sonam");
      list.add(1, "Sonam");

        System.out.println(list);

        // Set value at index 0
        list.set(0, "raj kumar");

        System.out.println(list);
  }

}



