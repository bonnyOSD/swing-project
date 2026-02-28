import javax.swing.*;
import java.awt.*;

public class Scrollpane extends JFrame{
    private Container c;
    private JTextArea ja;
    private Font f;
    private JScrollPane scroll;

    Scrollpane(){
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.magenta);

        f=new Font("Arial",Font.ITALIC,20);

        ja =new JTextArea();

        ja.setLineWrap(true);
        ja.setWrapStyleWord(true);
        ja.setFont(f);
        ja.setBackground(Color.ORANGE);
        ja.setForeground(Color.RED);

        scroll=new JScrollPane(ja,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER             );
        scroll.setBounds(50,50,300,200);
        c.add(scroll);


    }
    public static void main(String[] args) {
        Scrollpane frame= new Scrollpane();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50,40,500,400);
        frame.setTitle("TEXT AREA DEMO");
    }
}
