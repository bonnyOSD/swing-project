import javax.swing.*;
import java.awt.*;

public class Password extends JFrame {

    private Container c;
    private JPasswordField pf;
    private Font f;


    Password(){
        initcomponents();
    }

    public void initcomponents(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f=new Font("Arial",Font.BOLD,30);

        pf=new JPasswordField();
        pf.setEchoChar('*');
        pf.setFont(f);
        pf.setBounds(50,50,150,50);
        pf.setForeground(Color.WHITE);

        pf.setBackground(Color.RED);
        c.add(pf);
    }

    public static void main(String[] args) {
        Password frame=new Password();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("password demo");
    }


}
