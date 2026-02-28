import javax.swing.*;
import java.awt.*;

public class TextareaDemo extends JFrame {
    private Container c;
    private JTextArea ja;
    private Font f;

    TextareaDemo(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);

        f=new Font("Arial",Font.ITALIC,20);

        ja =new JTextArea();
        ja.setBounds(50,50,300,200);
        ja.setLineWrap(true);
        ja.setWrapStyleWord(true);
        ja.setFont(f);
        ja.setBackground(Color.ORANGE);
        ja.setForeground(Color.RED);
        c.add(ja);


    }
    public static void main(String[] args) {
        TextareaDemo frame= new TextareaDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,40,500,400);
        frame.setTitle("TEXT AREA DEMO");
    }
}
