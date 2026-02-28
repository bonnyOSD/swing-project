import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame{
    private Container c;
    private JLabel imglabel;
    private ImageIcon img;

    Demo(){
        initcomponents();
    }

    public  void initcomponents() {
        c = this.getContentPane();
        c.setBackground(Color.GRAY);
        c.setLayout(null);
        img= new ImageIcon(getClass().getResource("image.png"));
        imglabel =new JLabel(img);
        imglabel.setBounds(10,20,img.getIconWidth(),img.getIconHeight());
        c.add(imglabel);
    }
    public static void main(String[] args) {
        Demo frame= new Demo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Lable demo");
    }

}
