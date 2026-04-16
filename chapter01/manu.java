
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class manu {

  public static void main(String[] args) {
      JFrame f=new JFrame("main");
      f.setSize(500,600);
      f.setLayout(null);
      f.setVisible(true);
      JMenuBar mb=new JMenuBar();
      JMenu menu,subMenu;
      JMenuItem i1,i2,i3,i4,i5;
      menu=new JMenu("Menu");
      subMenu=new JMenu("Sub Menu");
      i1=new JMenuItem("1");
      i2=new JMenuItem("2");
      i3=new JMenuItem("3");
      i4=new JMenuItem("4");
      i5=new JMenuItem("5");

      menu.add(i1);
      menu.add(i2);
      menu.add(i3);
      subMenu.add(i4);
      subMenu.add(i5);
      menu.add(subMenu);
      mb.add(menu);
      f.setJMenuBar(mb);

  }

}
