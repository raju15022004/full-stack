
import javax.swing.JFrame;
import javax.swing.JTextField;

public class frame {


  public static void main(String[] args) {
      JFrame frame=new JFrame("main Frame");
      frame.setSize(400,400);
      frame.setLayout(null);
      frame.setVisible(true);
      // JButton b1=new JButton("Click me");
      // b1.setBounds(120,100,100,50);
      // frame.add(b1);

      JTextField t1=new JTextField("user name");
      t1.setBounds(100,100,100,30);
      frame.add(t1);
  }

}
