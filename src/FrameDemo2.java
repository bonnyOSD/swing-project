import javax.swing.*;
import java.awt.*;


public class FrameDemo2 extends JFrame {
    private ImageIcon icon;
    private Container c;

    FrameDemo2() {
        initcomponents();
    }

    public void initcomponents() {
        c = this.getContentPane();
        c.setBackground(Color.BLUE);

        icon = new ImageIcon(getClass().getResource("image.png"));
        this.setIconImage(icon.getImage());
    }

    public static void main(String[] args) {
        FrameDemo2 frame = new FrameDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("FrameDemo");
        frame.setResizable(false);
    }
}

