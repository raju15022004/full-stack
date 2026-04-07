
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class frame {


  public static void main(String[] args) {
      JFrame frame=new JFrame("main Frame");
      frame.setSize(500,600);
      frame.setLayout(null);
      frame.setVisible(true);
      // JButton b1=new JButton("Click me");
      // b1.setBounds(120,100,100,50);
      // frame.add(b1);

      // JTextField t1=new JTextField("user name");
      // t1.setBounds(100,100,100,30);
      // frame.add(t1);

      //////////////////////////////////////////////

      // String columns[]={"ID","Name","Salary"};
      // String data[][]={{"100","raju","50000"},
      // {"102","sani","60000"},{"103","Qader","70000"}};

      // JTable tb1=new JTable(data,columns);
      // tb1.setBounds(30,50,300,4000);
      // frame.add(tb1);

      ////////////////////////////////////

       JLabel l1=new JLabel("Which one is your favourites language ?");
       l1.setBounds(50,30,300,30);
       frame.add(l1);
       JCheckBox checkBox1=new JCheckBox("c++");
       checkBox1.setBounds(50,60,60,30);
       frame.add(checkBox1);
       JCheckBox checkBox2=new JCheckBox("java");
       checkBox2.setBounds(50,90,60,30);
       frame.add(checkBox2);
       JRadioButton rb1=new JRadioButton("Python");
       rb1.setBounds(50,120,80,30);
       frame.add(rb1);
       String data[]={"c++","python","javascript","java"};
       JComboBox comboBox1=new JComboBox<>(data);
       comboBox1.setBounds(50,180,100,30);
       frame.add(comboBox1);
  }

}
