import javax.swing.*;
import java.awt.*;

public class NewFrameDemo extends JFrame {
    private Container c;
    private JLabel lb;


    NewFrameDemo(){
        initcomponenet();
    }
    public void initcomponenet(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLUE);

        lb=new JLabel("hello everyone");
        lb.setBounds(50,50,250,50);
        c.add(lb);
    }


    public static void main(String[] args) {
        NewFrameDemo fr=new NewFrameDemo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(50,50,500,400);
        fr.setTitle("NEW FRAME");

    }
}
