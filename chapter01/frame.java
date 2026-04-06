
import javax.swing.JFrame;
import javax.swing.JTable;

public class frame {


  public static void main(String[] args) {
      JFrame frame=new JFrame("main Frame");
      frame.setSize(500,500);
      frame.setLayout(null);
      frame.setVisible(true);
      // JButton b1=new JButton("Click me");
      // b1.setBounds(120,100,100,50);
      // frame.add(b1);

      // JTextField t1=new JTextField("user name");
      // t1.setBounds(100,100,100,30);
      // frame.add(t1);

      String columns[]={"ID","Name","Salary"};
      String data[][]={{"100","raju","50000"},
      {"102","sani","60000"},{"103","Qader","70000"}};

      JTable tb1=new JTable(data,columns);
      tb1.setBounds(30,50,300,4000);
      frame.add(tb1);
  }

}
