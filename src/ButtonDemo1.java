import javax.swing.*;
import java.awt.*;

public class ButtonDemo1 extends JFrame {
    private Container c;
    private JButton jb1,jb2;
    private Font f;
    private Cursor cr;
    private ImageIcon img1,img2;

    ButtonDemo1(){
        initcomponents();
    }
    public void initcomponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f=new Font("Arial",Font.BOLD,20);
        cr=new Cursor(Cursor.HAND_CURSOR);

        img1=new ImageIcon(getClass().getResource("submit.png"));
        img2=new ImageIcon(getClass().getResource("close.png"));

        jb1=new JButton(img1);
        jb1.setBounds(20,100,220,50);
        jb1.setFont(f);
       // jb1.setForeground(Color.BLACK);
       // jb1.setBackground(Color.GREEN);
        jb1.setCursor(cr);
        c.add(jb1);

        jb2=new JButton(img2);
        jb2.setBounds(250,100,200,50);
        jb2.setFont(f);
        //jb2.setForeground(Color.YELLOW);
       // jb2.setBackground(Color.RED);
        c.add(jb2);


    }
    public static void main(String[] args) {
        ButtonDemo1 frame= new ButtonDemo1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("JBTTON DEMO");

    }
}
