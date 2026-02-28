import javax.swing.*;

public class Test1 {
    public static void main(String[] args) {
      String name1 = JOptionPane.showInputDialog(null,"Enter your first name ;","Title",3);
      String name2 = JOptionPane.showInputDialog("Enter your first name :");
      String name= name1+" "+name2;
      JOptionPane.showMessageDialog(null,"your full name :"+name);
    }
}
