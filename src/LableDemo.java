import javax.swing.*;
import java.awt.*;

public class LableDemo extends JFrame {
    private Container c;
    private JLabel label1,label2;
    private Font f;

    LableDemo(){
        initcomponents();
    }

    public  void initcomponents(){
        c=this.getContentPane();
        c.setBackground(Color.GRAY);
        c.setLayout(null);
        f=new Font("Arial",Font.BOLD,14);

        label1=new JLabel();
        label1.setText("Enter your user name :");
        label1.setBounds(10,15,250,30);
        label1.setFont(f);
        label1.setForeground(Color.BLACK);
        label1.setOpaque(true);
        label1.setBackground(Color.WHITE);
        label1.setToolTipText("Enter your username");
        c.add(label1);
        System.out.println(label1.getText());

        label2=new JLabel("Enter your password :");
        label2.setBounds(10,60,250,30);
        label2.setFont(f);
        label2.setForeground(Color.BLACK);
        label2.setOpaque(true);
        label2.setBackground(Color.WHITE);
        label2.setToolTipText("Enter your password");
        c.add(label2);
    }
    public static void main(String[] args) {
        LableDemo frame= new LableDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Lable demo");
    }

}
