import javax.swing.*;

public class FrameDemo extends JFrame {
    public static void main(String[] args) {
        FrameDemo frame= new FrameDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  frame.setSize(400,300);
       // frame.setLocation(200,50);
        frame.setBounds(200,50,400,300);
        frame.setTitle("FrameDemo");
        frame.setResizable(false);

    }
}
